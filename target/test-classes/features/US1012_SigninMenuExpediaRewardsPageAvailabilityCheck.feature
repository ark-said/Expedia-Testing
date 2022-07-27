Feature: US1012 Expedia Sign in Menu Expedia Rewards Availability Check

  @ExpediaRewardPageCheck
  Scenario: Check if it the Expedia Rewards in the sign in menu works
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the Sign In button
    And The user clicks on the Expedia Rewards
    And The user checks if there is a earn message