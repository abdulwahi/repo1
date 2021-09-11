def owner = 'abdulwahi'
def project = 'repo1'
def branchApi = new URL("https://api.github.com/repos/${owner}/${project}/branches")
def branches = new groovy.json.JsonSlurper().parse(branchApi.newReader())
branches.each {
  def branchName = it.name
  def jobName = "${owner}-${project}-${branchName}".replaceAll('/','-')
  job(jobName) {
    scm {
        git {
            remote {
              github("${owner}/${project}")
            }
            branch("${branchName}")
        }
    }
        steps {
        shell('ls -l')
    }
  }
}
