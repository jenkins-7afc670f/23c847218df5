pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        sh './mvnw clean install -Pit'
      }
//       post {
//         always {
//           junit '**/surefire-reports/*.xml'
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
