pipelineJob('build_pipeline') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('lsmarsden/vaadin-jenkins-jobs')
                    }
                    extensions {
                        cleanBeforeCheckout()
                    }
                }
            }
            scriptPath('pipelines/build_pipeline.Jenkinsfile')

        }
    }
}