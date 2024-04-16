job('run-python-script-job') {
    description 'Runs a Python script from the repository.'
    scm {
        git('https://github.com/techpro-aws-devops/Jenkins-DSL-Job-Example.git')
    }
    triggers {
        scm('* * * * *')  // Her dakika
    }
    steps {
        shell('python3 dsl.py')
    }
}
