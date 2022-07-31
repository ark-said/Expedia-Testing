Feature: US1026 Signup Facebook Login

  @SignupPageExternalLogin
  @ExpediaSignUpGoogleLogin
  Scenario: Check if you can access to reward Terms and conditions page from Sign Up page
    Given The user opens the Expedia signup page
    And The user clicks on the Google logo
    And The user confirms Google login page is available
