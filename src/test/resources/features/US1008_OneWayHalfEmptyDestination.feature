Feature: US1005 Expedia One Way Trip Half Empty Destination Error Check

  @HalfEmptyDestination
  @OneWayTripHalfEmptyDestination
  Scenario: Check if it gives an error message when the flight destination boxes are half empty
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the One-way
    And The user clicks on the One-way leaving from
    And The user adds a leaving flight for Oneway
    And The user clicks on the Search button
    Then The user checks if the error message is displayed for the one way trip when boxes are half empty
