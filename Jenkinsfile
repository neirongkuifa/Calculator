#!/usr/bin/env groovy
pipeline{
    agent any

    stages{
        stage('Git'){
            steps{
                git clone "https://github.com/neirongkuifa/Calculator.git"
            }
        }

        stage('Build'){
            steps{
                /usr/local/bin/mvn compile
            }
        }

        stage('Test'){
            steps{
                /usr/local/bin/mvn test
            }
        }
    }
}