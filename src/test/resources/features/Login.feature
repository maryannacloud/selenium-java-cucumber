Feature: login functionality

  Scenario: verify user is able to log in with valid credentials
    When when user enters a valid "valid.username" and valid "valid.password"
    And user clicks on sign in button
    Then user is logged on