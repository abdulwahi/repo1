job('demo') {
    steps {
        shell('echo Hello Jeyender! && echo $USER && pwd && ls')
    }
}

job('demo2') {
    steps {
        shell('echo Hello Abdul_jeyender! && echo $USER && pwd && ls')
    }
}
