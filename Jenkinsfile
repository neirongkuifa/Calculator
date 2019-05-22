#!/usr/bin/env groovy
pipeline{
    agent any

    stages{
        stage('Git'){
            steps{
                sh "/usr/local/bin/mvn clean"
                sh "rm -r Calculator"
                sh "git clone 'https://github.com/neirongkuifa/Calculator.git'"
            }
        }

        stage('Deploy'){
            steps{
                sh "/usr/local/bin/mvn deploy"
            }
        }
    }
}