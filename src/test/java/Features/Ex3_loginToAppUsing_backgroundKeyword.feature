Feature: login to application with background keyword

  Background:
    Given user is on login page
    When user enter valid username

  Scenario: S4-login to app using valid credentials
    And user enter valid password
    And user click on login btn
    Then home should be visible

  Scenario: S5-login to app using invalid credentials
    And user enter invalid password
    And user click on login btn
    Then login failed message should be visible

