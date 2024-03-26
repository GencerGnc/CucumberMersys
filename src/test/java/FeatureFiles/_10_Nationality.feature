Feature: Fees multiple values functionality

  Background:
    Given Navigate to campus
    When Enter user name and password and click login button
    Then User should successfully

  Scenario Outline: Nationality

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | nationality |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |
    And Click on the Element in Dialog
      | saveButton |
    Then Success message should be displayed
    And User delete the Element from Dialog
      | <name> |
    Examples:
      | name |
      | bobamarth |
      | chichane |
      | aleser |
      | casper |
