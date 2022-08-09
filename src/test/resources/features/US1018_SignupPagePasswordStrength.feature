Feature: US1018 Expedia Sign Up Invalid Mail

  @ExpediaSignUpPasswordStrengthVisibility
  Scenario: Check if you can see strength menu's warnings
    Given The user opens the Expedia signup page
    And The user fills out all the boxes with valid information
    And The user checks if the password strength information are visible

