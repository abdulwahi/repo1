def owner = 'abdulwahi'
def project = 'repo1'
def repoApi = new URL("https://api.github.com/users/${owner}/repos")
def repos = new groovy.json.JsonSlurper().parse(repoApi.newReader())
repos.each {
  def repoName = it.name
  def jobName = "${owner}-${repoName}".replaceAll('/','-')
  job(jobName) {
    scm {
        git {
            remote {
              github("${owner}/${project}")
            }
            branch("main")
        }
    }
        steps {
        shell('ls -l')
    }
  }

pipelineJob(jobName) {
  definition {
    cps {
      script('''
        pipeline {
            agent any
                stages {
                    stage('Stage 1') {
                        steps {
                            echo 'logic'
                        }
                    }
                    stage('Stage 2') {
                        steps {
                            echo 'logic'
                        }
                    }
                }
            }
        }
      '''.stripIndent())
      sandbox()
    }
  }
}
}
