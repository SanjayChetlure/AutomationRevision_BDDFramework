@regression
Feature: login to application feature - tags

  @sanity
  Scenario: S7-login to app using valid credentials
    Given user is on login page
    When user enter valid username
    And user enter valid password
    And user click on login btn
    Then home should be visible

  @sanity
  Scenario: S8-login to app using invalid credentials
    Given user is on login page
    When user enter valid username
    And user enter invalid password
    And user click on login btn
    Then login failed message should be visible

    @smoke
  Scenario: S9-login to app using test data
    Given user is on login page
    When user enter username as "abc"
    And user enter password as "xyz"
    And user enter pin as 1234
    And user click on login btn
    Then home should be visible with "abcXyx" logo text

  @performance
  Scenario: S10-login to app using test data
    Given user is on login page
    When user enter username as "abc"
    And user enter password as "xyz"
    And user enter pin as 1234
    And user click on login btn
    Then home should be visible with "abcXyx" logo text





