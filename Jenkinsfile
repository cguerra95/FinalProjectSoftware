pipeline {
  agent any
  stages {
    stage('Build stage') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }

    stage('Test Stage') {
      steps {
        sh 'mvn test'
        echo 'First Test Case -ozj___'
      }
    }

  }
}