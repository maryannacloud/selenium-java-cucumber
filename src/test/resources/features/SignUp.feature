Feature: Sign Up functionality

  @DB
  Scenario: verify the user is able to register with fake credentials
    Given the user is on the login page
    When user clicks on sign up here link
    And user fills out the first registration page
    And user fills out the second registration page
    Then the user account is created successfully
    And the "valid.username" is created in the database


