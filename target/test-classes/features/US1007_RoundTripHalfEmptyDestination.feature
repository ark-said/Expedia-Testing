Feature: US1004 Expedia Round Trip Half Empty Destination Error Check

  @HalfEmptyDestination
  @RoundTripHalfEmptyDestination
  Scenario: Check if it gives an error message when the info boxes are half empty
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the Roundtrip
    And The user verifies that returning text appears
    And The user clicks on the Roundtrip leaving from
    And The user adds a leaving flight for Roundtrip
    And The user clicks on the Search button
    Then The user checks if the error message is for the Round Trip displayed when the boxes are half empty
