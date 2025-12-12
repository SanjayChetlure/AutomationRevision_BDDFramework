Feature: products order End to End feature

  Background:
    Given user is on swagLab login page
    When user enter username "username" on swaglab login page
    And wait for 1 second
    And user enter password "password" on swaglab login page
    And wait for 1 second
    And user click on login button on swaglab login page
    And wait for 1 second
    Then swag page should be visible with logo text "Swag Labs"
    And wait for 3 second

    Scenario: SC3 -order place E2E
      And user click on Add to cart option for product SwagLabsBackpack
      And wait for 1 second
      And user click on cart option
      And wait for 1 second
      And user click on checkout button
      And user enter firstname as "abc"
      And user enter lastname as "xyz"
      And user enter pin code as 123456
      And wait for 1 second
      And user click on continue button
      And wait for 1 second
      And user click on finish button
      Then order place message "Thank you for your order!" should be visible
      And wait for 5 second