Feature: US1006 Expedia Multi Way Trip Half Empty Destination Error Check

  @HalfEmptyDestination
  @MultiWayTriHalfpEmptyDestination
  Scenario: Check if it gives an error message when the info boxes are half empty
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the Multi-city
    Then The user confirms that there is a Add Another Flight button
    And The user clicks on the Multiway leaving from
    And The user adds a leaving flight for MultiWay
    And The user clicks on the Search button
    Then The user checks if the error message is displayed for the multi way trip when it is half empty
