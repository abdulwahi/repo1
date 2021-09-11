job('demo') {
    scm {
        git('https://github.com/abdulwahi/repo1.git')
    }
    steps {
        shell('echo Hello Abdul_jeyender! && echo $USER && pwd && ls')
        }
}

job('demo2') {
    steps {
        shell('echo Hello Abdul_jeyender! && echo $USER && pwd && ls')
    }
}
