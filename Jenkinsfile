#!/usr/bin/env groovy
pipeline{
    agent any

    stages{
        stage('Git'){
            steps{
                sh "git clone 'https://github.com/neirongkuifa/Calculator.git'"
            }
        }

        stage('Build'){
            steps{
                sh "/usr/local/bin/mvn compile"
            }
        }

        stage('Test'){
            steps{
                sh "/usr/local/bin/mvn test"
            }
        }
    }
}