Feature: Registration

  Scenario: Valid Registration
    Given I navigate to the site "https://www.propertyrete.com"
    When I click on register button
    And I enter first Name "Anne"
    And I enter last Name "Mensi"
    And I enter Email Address "prop@myautomation.33mail.com"
    And I enter Valid Mobile Number "07575757543"
    And I enter Password "12345hs"
    And I Confirm Password "12345hs"
    And I click valid the Captcha
    And I click on create account button
    And I click on activation account
    Then I am registered