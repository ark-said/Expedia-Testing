Feature: US1002 Expedia One-way Check

  @FlightOptions
  @ExpediaOneWayCheck
  Scenario: Check If the One-way option from flights is working
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the One-way
