Feature: : Open bank account
  Scenario: opening acc with nominee info
    Given user should be at account opening page
    When user enters following data
      | FN    |  LN    |   Mail ID         |    Mob Num |
      | abc1  | xyz1   | abc1@gmail.com    | 8888888888 |
      | abc2  | xyz2   | abc2@gmail.com    | 9999999999 |
      | abc3  | xyz3   | abc3@gmail.com    | 1111111111|
    And user click on submit btn
    Then user get created
