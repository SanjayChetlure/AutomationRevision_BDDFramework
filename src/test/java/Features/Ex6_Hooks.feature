
Feature: login to application feature - Hooks


  Scenario: S11-login to app using valid credentials
    Given user is on login page
    When user enter valid username
    And user enter valid password
    And user click on login btn
    Then home should be visible


  Scenario: S12-login to app using invalid credentials
    Given user is on login page
    When user enter valid username
    And user enter invalid password
    And user click on login btn
    Then login failed message should be visible




