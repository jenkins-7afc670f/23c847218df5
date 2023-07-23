pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        sh './mvnw clean test'
      }
//       post {
//         always {
//           testng '**/surefire-reports/*.xml'
//           cucumber buildStatus: 'null',
//           customCssFiles: '',
//           customJsFiles: '',
//           failedFeaturesNumber: -1,
//           failedScenariosNumber: -1,
//           failedStepsNumber: -1,
//           fileIncludePattern: 'target/cucumber-reports.json',
//           pendingStepsNumber: -1,
//           skippedStepsNumber: -1,
//           sortingMethod: 'ALPHABETICAL',
//           undefinedStepsNumber: -1
//         }
//       }
    }
  }
}
