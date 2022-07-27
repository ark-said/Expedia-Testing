Feature: US1013 Expedia Sign in Menu Feedback Availability Check

  @ExpediaFeedbackCheck
  Scenario: Check if it the Feedback in the sign in menu works
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the Sign In button
    And The user clicks on the Feedback
    And The user checks if there is a Feedback main page