Feature: US1005 Expedia One Way Trip Empty Destination Error Check

  @EmptyDestination
  @OneWayTripEmptyDestination
    Scenario: Check if it gives an error message when the flight destination boxes are empty
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the One-way
    And The user clicks on the Search button
    Then The user checks if the error message is displayed for the one way trip
