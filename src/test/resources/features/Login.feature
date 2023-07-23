Feature: Login Feature
  Scenario: positive flow
    Given I go to saucedemo website
    When I enter username "standard_user" and password "secret_sauce"
    Then I click "Login" button
    Then I see products