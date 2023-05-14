@test
Feature: Home Page Test
    Scenario: User is in Home page
      Given user is in home page
      Then  user can view different packages types

    Scenario Outline: User can select different countries to view package prices
      Given user opens countries popup
      When user selects "<country>"
      Then the correct "<currency>" is displayed
      Examples:
      | country | currency |
      | ae      | AED      |
      | iq      | IQ       |
      | om      | OMR      |