Feature: US1028 Signup Page Keep Me Signed In

  @ExpediaSignUpKeepMeSignedIn
  Scenario: Check if the Keep Me Signed In button works
    Given The user opens the Expedia signup page
    And The user clicks on the keep me signed in button
    And The user confirms signed in text is visible
