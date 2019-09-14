Feature: Login
  
  Scenario: Valid Login
    Given I navigate to the site "https://www.propertyrete.com"
    When I click on login button
    And I enter my email address "prop@myautomation.33mail.com"
    And I enter my Password "12345hs"
    And I click on Sign In button
    Then I am signed in