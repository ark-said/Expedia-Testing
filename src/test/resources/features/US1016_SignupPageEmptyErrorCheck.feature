Feature: US1016 Expedia Sign in Menu Sign Up Feature Availability Check

  @ExpediaSignUpEmptyCheck
  Scenario: Check if error messages appear when flights are left blank
    Given The user opens the Expedia signup page
  And The user clicks on all the boxes
    And The user checks if there are error messages


