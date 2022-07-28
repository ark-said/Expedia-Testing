
Feature: US1021 Signup Page Password Strength Level Check

  @ExpediaSignUpPasswordStrengthLevelCheck
  Scenario: Check if you can see strength menu's password info
    Given The user opens the Expedia signup page
    And The user will enter an eight-character password that meets all requirements, but will still be considered Weak
    And The user will enter an nine-character password that meets all requirements, it will be considered Strong
    And The user will enter an eleven-character password that meets all requirements and last two characters must different three before the last one then it will be considered Very Strong





