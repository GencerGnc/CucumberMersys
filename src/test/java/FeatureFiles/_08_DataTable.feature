Feature: DataTable Functionality

  Background:
    Given Navigate to campus
    When Enter user name and password and click login button
    Then User should successfully

  Scenario: Create Country
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | genc12  |
      | codeInput | genco12 |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | genc12 |

    Then Success message should be displayed


  Scenario: CitizenShip Create

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |
    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | delalim14 |
      | shortName | delalim   |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | delalim14 |
    Then Success message should be displayed

  Scenario: Create nationality and delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | nationality |
    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | delalim20 |
    And Click on the Element in Dialog
      | saveButton |
    Then Success message should be displayed
    And User delete the Element from Dialog
      | delalim20 |
    Then Success message should be displayed

  Scenario: Fee Functionality and Delete

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | fees       |
    And Click on the Element in Dialog
      | addButton |


    And User sending the keys in Dialog
      | nameInput       | delalim212 |
      | codeInput       | 06612  |
      | integrationCode | 1299     |
      | priority        | 489     |
    And Click on the Element in Dialog
      | spaceClick |

    And Click on the Element in Dialog
      | saveAndclose |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | delalim212 |
    Then Success message should be displayed



