new gantry.PxBuild()
  .withName('colander')
  .withFunctionalTests()
  .withDockerRegistry('registry-v2.revinate.net/app')
  // .withAutoDeployToTest()
  .execute()

stage 'Helm publish'
node {
    checkout scm
    helmPublish()
}