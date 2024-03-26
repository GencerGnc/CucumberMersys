Feature: Inventory multiple values functionality

  Background:
    Given Navigate to campus
    When Enter user name and password and click login button
    Then User should successfully

  Scenario Outline: Inventory Functionality and Delete

    And Click on the Element in LeftNav
      | inventory      |
      | inventorySetup |
      | ItemCategories |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |
    And Click on the Element in Dialog
      | userType |
      | studentClick |

    And Click on the Element in Dialog
      | saveButton |
    Then Success message should be displayed
    And User delete the Element from Dialog
      | <name> |
    Then Success message should be displayed
    Examples:
      | name    |
      | casper1 |
      | casper2 |
      | casper3 |
      | casper4 |