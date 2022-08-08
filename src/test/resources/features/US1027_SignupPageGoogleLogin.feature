Feature: US1027 Signup Google Login

  @SignupPageExternalLogin
  @ExpediaSignUpGoogleLogin
  Scenario: Check if the user can access to Google Login page from the Sign Up page
    Given The user opens the Expedia signup page
    And The user clicks on the Google logo
    And The user confirms Google login page is available
