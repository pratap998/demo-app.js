pipeline {
    agent any
    
    stages {
        stage('Clone-Repo') {
            steps {
              checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'MYGITHUB', url: 'https://github.com/pratap998/demo-app.js.git']]]) 
            }
        }
        stage('Build image') {
            steps {
              sh "docker build -t demo-app.js ."
            }
        }
        stage('image scanning') {
            steps {
              sh "trivy image demo-app.js > scanreport.txt"
            }
        }
        
            
        }
}
    
