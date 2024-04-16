job('run-python-script-job-DSL') {
    description 'Runs a Python script from the repository.'
    scm {
        git('https://github.com/techpro-aws-devops/Jenkins-DSL-Job-Example.git', 'main')
    }
    triggers {
        scm('* * * * *')  // Her dakika
    }
    steps {
        shell('python3 dsl.py')
    }
}
