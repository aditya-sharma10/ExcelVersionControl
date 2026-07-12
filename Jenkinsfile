pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                bat '.\\mvnw.cmd clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t datasync-app .'
            }
        }

        stage('Stop Old Containers') {
            steps {
                bat 'docker compose down'
            }
        }

        stage('Deploy') {
            steps {
                bat 'docker compose up -d'
            }
        }
    }

    post {
        success {
            echo 'CI/CD Pipeline Executed Successfully!'
        }

        failure {
            echo 'Build Failed!'
        }
    }
}