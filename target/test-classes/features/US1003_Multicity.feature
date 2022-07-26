Feature: US1002 Expedia Multi-city Check

  @FlightOptions
  @ExpediaMulticityCheck
  Scenario: Check If the Multi-city option from flights is working
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the Multi-city
    Then The user confirms that there is a Add Another Flight button
