pipeline {
    agent any

    tools {
        maven 'maven'
    }
    stages {

        stage('Building') {
            steps {
                echo('Building Vaadin pipeline')
                git branch: 'main',
                        poll: false,
                        url: 'https://github.com/lsmarsden/vaadin-flow.git'

                sh 'mvn clean install'
            }
            post {
                success {
                    archiveArtifacts artifacts: 'target/*.jar',
                            followSymlinks: false
                }
            }
        }
    }
}