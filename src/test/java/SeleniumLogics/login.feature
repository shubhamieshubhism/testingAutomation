Feature: User Login

  Scenario: Successful Login with Valid Credentials
    Given User is on the login page
    When User enters valid username "testuser" and password "password123"
    And User clicks on the login button
    Then User should be redirected to the homepage
    And A welcome message should be displayed

  Scenario: Login with Invalid Credentials
    Given User is on the login page
    When User enters invalid username "wronguser" and password "wrongpass"
    And User clicks on the login button
    Then An error message should be displayed

  Scenario: Login with Empty Fields
    Given User is on the login page
    When User clicks on the login button without entering credentials
    Then A validation message should be displayed