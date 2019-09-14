Feature: For Sale
  
  Scenario: Valid for sale feature
    
    Given I navigate to the site "https://www.propertyrete.com"
    When I click on for sale link
    And I select Property Category "Rent "
    And I select Property Type "House"
    And enter a Property Name "Annick"
    And I select a Number of bedroom "4+"
    And I select a Number of bathroom "3+"
    And I select Min Price "200000"
    And I select Max Price "500000"
    And I click Search button
    Then I find the property
