def githubUrl = "https://github.com/nicobolzoni/jenkins_groovy_script.git"

pipelineJob("Seed job 1") {
definition {
    cpsScm {
        scm {
            git{
              remote {
                url("${githubUrl}")
                // credentials("${SSH_CREDENTIALS}")
              }
              branch("*/do-not-merge")
            }
        }
    }
  }
}