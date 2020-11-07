Feature: Feature to test google search

  Scenario: 
    Check google search is working

    Given Browser is open
    And User is on google search page
    When User enters a text in search box
    And Click search button
    Then User should be navigated to the search results
