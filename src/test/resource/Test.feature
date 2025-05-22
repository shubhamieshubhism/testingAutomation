Feature: use login functionality
  Background:
    Given user is on login page
    And login page is loaded successfully

  Scenario: login successfully
    When enter valid credentials
    Then user should be redirected to dashboard

  Scenario: login with invalid credentials
    When when invalid credentials are entered
    Then user should see an error message