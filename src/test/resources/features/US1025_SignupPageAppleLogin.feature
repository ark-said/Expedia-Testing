Feature: US1025 Signup Apple Login

  @SignupPageExternalLogin
  @ExpediaSignUpAppleLogin
  Scenario: Check if you can access to reward Terms and conditions page from Sign Up page
    Given The user opens the Expedia signup page
    And The user clicks on the Apple logo
    And The user confirms apple login page is avaible
