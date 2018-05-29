pipeline{
  agent any

  environment {
          NameSpace='winton_jason'
          WebServer='172.31.12.139'
          port='8120'
      }

  stages{
     stage('start'){
        steps {
                        step([$class: 'WsCleanup'])
                    git  poll: true,  url: 'https://github.com/WuShujie/spring-boot-basic.git', branch: 'master'
                    }
     }

        stage('Sonar') {
            steps {
                sh './gradlew sonarqube'
            }
        }

        stage('test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('build'){
            steps{
                sh './gradlew build'
            }
        }

        stage('deploy'){
            steps {
                            withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                                sh './deploy.sh'
                            }
                        }
        }

  }
}