Feature: US1032 SignIn Facebook Login

  @SignInPageExternalLogin
  @ExpediaSignInFacebookLogin
  Scenario: Check if the user can access to Facebook Login page from the Sign In page
    Given The user opens the Expedia signin page
    And The user clicks on the Facebook logo
    And The user confirms Facebook login page is available
