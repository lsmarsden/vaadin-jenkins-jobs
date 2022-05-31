pipeline {
    agent any

    tools {
        maven 'maven'
    }
    stages {
        stage('Checkout') {
            git branch: 'main',
                poll: false,
                url: 'https://github.com/lsmarsden/vaadin-flow.git'
        }
        stage('Building') {
            steps {
                echo('Building Vaadin pipeline')
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