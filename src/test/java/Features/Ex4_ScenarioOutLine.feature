Feature: login to application using scenario outline feature

  Scenario Outline: S6-login to app using scenario outline
    Given user is on login page
    When user enter username as "<UN>"
    And user enter password as "<PWD>"
    And  user enter pin as <PIN>
    And user click on login btn
    Then home should be visible with "abcXyx" logo text

    Examples:
      |  UN | PWD | PIN |
      |  abc1| xyz1| 1111 |
      |  abc2| xyz2| 2222 |
      |  abc3| xyz3| 3333 |
      |  abc4| xyz4| 4444 |