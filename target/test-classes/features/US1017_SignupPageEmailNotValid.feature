Feature: US1017 Expedia Sign Up Invalid Mail

  @ExpediaSignUpNotValidEmail
  Scenario: Check if you can sign up with invalid mail adress
    Given The user opens the Expedia signup page
   And The user writes invalid e-mail
    And The user fills all the other boxes with valid information
    And The user checks if there is a Enter a valid email adress error


