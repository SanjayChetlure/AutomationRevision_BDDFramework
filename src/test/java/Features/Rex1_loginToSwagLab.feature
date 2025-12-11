@regression
Feature: swag lab login feature
  Background:
    Given user is on swagLab login page
    When user enter username "username" on swaglab login page
    And wait for 1 second

  @sanity
  Scenario: SC1- Login to Swag lab application with valid credentials
    And user enter password "password" on swaglab login page
    And wait for 1 second
    And user click on login button on swaglab login page
    And wait for 1 second
    Then swag page should be visible with logo text "Swag Labs"
    And wait for 3 second

  @smoke
  Scenario: SC2- Login to Swag lab application with invalid credentials
    And user enter password "inValidPassword" on swaglab login page
    And wait for 1 second
    And user click on login button on swaglab login page
    And wait for 1 second
    Then login failed error msg visible