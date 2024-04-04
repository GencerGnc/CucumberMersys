Feature: ApachePOI Citizen Functionality

  Background:
    Given Navigate to campus
    When Enter user name and password and click login button
    Then User should successfully


  Scenario: Create and Delete CitizenShip from excel
    When User create citizenship with ApchePOI
    Then User delete citizenship with ApchePOI
