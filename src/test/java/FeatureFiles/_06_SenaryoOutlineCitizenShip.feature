
Feature: Multi Create a Citizenship

  Background:
    Given Navigate to campus
    When Enter user name and password and click login button
    Then User should successfully
    And Navigate to CitizenShip


  Scenario Outline: Create a CitizenShip with parameter

    When Create CitizenShip name as "<name>" code as "<shortName>"
    Then Success message should be displayed


    When Create CitizenShip name as "<name>" code as "<shortName>"
    Then Already message should be displayed


    When User delete as name as "<name>"
    Then Success message should be displayed
    Examples:
      |name    | shortName   |
      |GGg1231234 | GncCS1short |
      |GGasd45234222| GncCS2short |
      |GnGas5235234  | GncCS3short |
      |Gnasf235235234 | GncCS4short |
      |Gncasgas890976  | GncCS5short |