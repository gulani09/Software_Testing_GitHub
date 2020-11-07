Feature: Feature to test login functionality

  Scenario: Check login is successfull with valid credentials
    Given user is on the login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigate to the home page
