Feature: Country Functionality
  @SmokeTest
  Scenario: Create a country
    Given Navigate to campus
    When Enter user name and password and click login button
    Then User should successfully
    And Navigate to country
    When Create country
    Then Success message should be displayed