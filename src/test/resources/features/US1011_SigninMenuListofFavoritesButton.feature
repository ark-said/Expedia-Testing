Feature: US1011 Expedia Sign In Menu Favorites Availability

  @SigninMenuListofFavoritesButton
  Scenario: Check if it the favorites button in the sign in menu works
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the Sign In button
    And The user clicks on the list of favorites
    And The user checks if there is a heart icon