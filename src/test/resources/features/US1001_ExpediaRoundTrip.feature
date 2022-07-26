Feature: US1001 Expedia Round Trip Check

  @FlightOptions
  @ExpediaRoundTripCheck
  Scenario: Check If the Roundtrip option from flights is working
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the Roundtrip
    Then The user verifies that returning text appears

