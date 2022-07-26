Feature: US1011 Expedia Sign In Wrong Email Wrong Password

  @SignInWrongEmailWrongPassword
  Scenario: Check if it gives an error message when you write wrong email and password
    Given The user opens the Expedia website
    And The user sees Expedia's home page is visible
    And The user clicks on the flights
    And The user clicks on the Sign In button
    And The user cliks on the Sign In button in the Sign In options menu
    And The user writes an email and a password
    And The user clicks on the Sign In button in the Sign In
    And The user checks if the error message for no match is displayed
