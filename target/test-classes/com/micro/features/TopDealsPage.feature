Feature: Micro Center Top Deals Page
  As a bargain-hunting customer
  I want to view the Top Deals page
  So that I can find the best discounts on laptop products

  Background:
    Given I navigate to the Micro Center website
    And I click on the Top Deals link in the navigation

  Scenario: Verify Top Deals Page Structure
    Then I should see the "Top Deals" logo
    And I should click the shop laptop saving event
    And I should see the laptop saving event
    And I click on add to card
    And  I click on view card
    And i click on cheackout button
    When I put on email address
    And Put on password
    Then click on sign in button