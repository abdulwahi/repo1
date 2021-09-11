job('demo') {
    steps {
        shell('echo Hello World! && echo $USER && pwd && ls')
    }
}

job('demo2') {
    steps {
        shell('echo Hello World! && echo $USER && pwd && ls')
    }
}
