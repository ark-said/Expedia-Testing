Feature: US1026 Signup Facebook Login

  @SignInPageExternalLogin
  @ExpediaSignInFacebookLogin
  Scenario: Check if you can access to reward Terms and conditions page from Sign Up page
    Given The user opens the Expedia signin page
    And The user clicks on the Facebook logo
    And The user confirms Facebook login page is available