Feature: US1031 SignIn Apple Login

  @SignInPageExternalLogin
  @ExpediaSignInAppleLogin
  Scenario: Check if the user can access to Apple Login page from the Sign In page
    Given The user opens the Expedia signin page
    And The user clicks on the Apple logo
    And The user confirms apple login page is available
