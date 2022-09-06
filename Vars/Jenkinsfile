pipeline {
    agent any
    
    stages {
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
    
