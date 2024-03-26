Feature: Fees multiple values functionality

  Background:
    Given Navigate to campus
    When Enter user name and password and click login button
    Then User should successfully

  Scenario Outline: Fee Functionality and Delete

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | fees       |
    And Click on the Element in Dialog
      | addButton |


    And User sending the keys in Dialog
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priority        | <priority> |
    And Click on the Element in Dialog
      | spaceClick |

    And Click on the Element in Dialog
      | saveAndclose |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | <name> |
    Then Success message should be displayed
    Examples:
      | name      | code  | intCode | priority |
      | delalim89 | 1261 | Paypal  | 9789      |
      | delalim88 | 1262 | Paypal  | 9876      |
      | delalim86 | 1263 | Paypal  | 9569      |
      | delalim85 | 1264 | Paypal  | 9983      |