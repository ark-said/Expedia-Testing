Feature: US1014 Expedia Sign in Menu Sign Up Feature Availability Check

  @ExpediaSignUpCheck
  Scenario: Check if it the sign up in the sign in menu works
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the Sign In button
    And The user clicks on the Sign Up
    And The user checks if there is a Conditions text