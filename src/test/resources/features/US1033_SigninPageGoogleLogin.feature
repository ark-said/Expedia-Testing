Feature: US1033 SignIn Google Login

  @SignInPageExternalLogin
  @ExpediaSignInGoogleLogin
  Scenario: Check if the user can access to Google Login page from the Sign In page
    Given The user opens the Expedia signin page
    And The user clicks on the Google logo
    And The user confirms Google login page is available
