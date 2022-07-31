Feature: US1031 Signin Apple Login

  @SignInPageExternalLogin
  @ExpediaSignInAppleLogin
  Scenario: Check if you can access to reward Terms and conditions page from Sign Up page
    Given The user opens the Expedia signin page
    And The user clicks on the Apple logo
    And The user confirms apple login page is available
