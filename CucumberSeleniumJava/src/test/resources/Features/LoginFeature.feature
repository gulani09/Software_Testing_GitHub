Feature: Feature to test google search

  Scenario Outline: 
    Check google search is working

    Given Browser is open
    And User is on login page
    When User enters <username> and <password>
    And Click login button
    Then User should be navigated to the home page

    Examples: 
      | username | password |
      | gulani   |    12345 |
      | Ele      |    12345 |
