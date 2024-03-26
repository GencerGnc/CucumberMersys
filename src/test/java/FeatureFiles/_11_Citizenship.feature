Feature: Citizenship multiple values add and delete

  Background:
    Given Navigate to campus
    When Enter user name and password and click login button
    Then User should successfully
    And Navigate to CitizenShip


  Scenario Outline: Create a CitizenShip with parameter

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |
    And Click on the Element in Dialog
      | addButton |
    And User sending the keys in Dialog
      | nameInput | <name>      |
      | shortName | <shortName> |
    And Click on the Element in Dialog
      | saveButton |
    Then Success message should be displayed

    And User delete the Element from Dialog
      | <name> |

    Examples:
      | name           | shortName   |
      | GGg1231234     | GncCS1short |
      | GGasd45234222  | GncCS2short |
      | GnGas5235234   | GncCS3short |
      | Gnasf235235234 | GncCS4short |
      | Gncasgas898876 | GncCS5short |