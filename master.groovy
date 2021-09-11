job('demo') {
    steps {
        shell('echo Hello Jeyender! && echo $USER && pwd && ls')
    }
}

job('demo2') {
    steps {
        shell('echo Hello Abdul! && echo $USER && pwd && ls')
    }
}

job('demo3') {
    steps {
        shell('echo Hello Abdul! && echo $USER && pwd && ls')
    }
}
