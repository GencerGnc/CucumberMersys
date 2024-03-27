Feature: Create a Citizenship
  @SmokeTest
  Scenario: Create a CitizenShip
    Given Navigate to campus
    When Enter user name and password and click login button
    Then User should successfully
    And Navigate to CitizenShip
    When Create CitizenShip
    Then Success message should be displayed