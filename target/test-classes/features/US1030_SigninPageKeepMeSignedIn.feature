Feature: US1030 SignIn Page Keep Me Signed In

  @ExpediaSignInKeepMeSignedIn
  Scenario: Check if you can access to reward Terms and conditions page from Sign Up page
    Given The user opens the Expedia signin page
    And The user clicks on the keep me signed in button - Signed In
    And The user confirms signed in text is visible - Signed In
