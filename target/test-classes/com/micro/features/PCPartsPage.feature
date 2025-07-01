Feature: Browse and add PC Parts on Micro Center
@regression
  Scenario: Add the first PC part listed to the cart
  Given I have to open chrome browser
    When I am in Microcenter home page
    Given I am on the Micro Center PC Parts page
    When I click on the first intel CPUS item
    And I click on add to card
    And  I click on view card
    And i click on cheackout button
    When I put on email address
    And Put on password
    Then click on sign in button
