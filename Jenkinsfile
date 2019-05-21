#!/usr/bin/env groovy
pipeline{
    agent any

    stages{
        stage('Git'){
            steps{
                sh "rm -r Calculator"
                sh "git clone 'https://github.com/neirongkuifa/Calculator.git'"
            }
        }

        stage('Compile'){
            steps{
                sh "/usr/local/bin/mvn compile"
            }
        }

        stage('Test'){
            steps{
                sh "/usr/local/bin/mvn test"
            }
        }

        stage('Package'){
            steps{
                sh "/usr/local/bin/mvn package"
            }
        }
    }
}