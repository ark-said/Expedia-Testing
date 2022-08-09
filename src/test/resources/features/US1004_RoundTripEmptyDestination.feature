Feature: US1004 Expedia Round Trip Empty Destination Error Check

  @EmptyDestination
  @RoundTripEmptyDestination
  Scenario:  Check if it gives an error message when the flight destination boxes are empty
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the Roundtrip
    And The user verifies that returning text appears
    And The user clicks on the Search button
    Then The user checks if the error message is for the Round Trip displayed
