Feature: login to application using Test data feature

  Scenario: S3-login to app using test data
    Given user is on login page
    When user enter username as "abc"
    And user enter password as "xyz"
    And user enter pin as 1234
    And user click on login btn
    Then home should be visible with "abcXyx" logo text