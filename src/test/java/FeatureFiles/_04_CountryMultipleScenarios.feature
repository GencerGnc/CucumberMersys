Feature: Country Multi Secenerio
  Background: #before seneryo
  Given Navigate to campus
    When Enter user name and password and click login button
    Then User should successfully
    And Navigate to country

    Scenario: Create a country
      When Create country
      Then Success message should be displayed

      Scenario: Create a country 2
        When Create country name as "Gencer" code as "UlkeKodtr"
        Then Success message should be displayed