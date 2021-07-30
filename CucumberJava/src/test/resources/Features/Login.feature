Feature: Feature to test login functionality

  Scenario: Check ogin is successfull with valid credentials
    Given browser is open
    And User is on login page
    When User enters Username and Password
    And clicks on login button
    Then User is navigated to the home page
