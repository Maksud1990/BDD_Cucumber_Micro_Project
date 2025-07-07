Feature: Computers Page Functionality on Micro Center
@regression
  Scenario: User navigates to Computers page, filters by Desktop Computers, and adds a product to the cart
  Given I have to open chrome browser
    Given User is on the Micro Center home page
    When User navigates to the "Computers" page
    And User selects "Gaming Desktop " from the category filters
    And User selects G453 Gaming PC from the list
    And I click on Add To Card
    And  I click on ViewCard
    And i click on cheackout button
    
    And I click on checkout as guest
    And I put on FirstName
    And I put on LastName
    And I put On Email Address
    And I put on Phone Number
    And I click on Continue Button
    Then The product should be added to the cart successfully
