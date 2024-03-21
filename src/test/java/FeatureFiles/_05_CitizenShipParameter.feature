
Feature: Multi Create a Citizenship

  Background:
  Given Navigate to campus
  When Enter user name and password and click login button
  Then User should successfully
  And Navigate to CitizenShip


  Scenario: Create a CitizenShip

    When Create CitizenShip name as "Kakaa" code as "Latee"
    Then Success message should be displayed

    Scenario: Create a Citizenship same name
      When Create CitizenShip name as "Kakaa" code as "Latee"
      Then Already message should be displayed

      Scenario: Remove CitizenShip
        When User delete as name as "Kakaa"
        Then Success message should be displayed
