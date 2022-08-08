Feature: US1026 Signup Facebook Login

  @SignupPageExternalLogin
  @ExpediaSignUpFacebookLogin
  Scenario: Check if the user can access to Google Login page from the Sign Up page
    Given The user opens the Expedia signup page
    And The user clicks on the Facebook logo
    And The user confirms Facebook login page is available
