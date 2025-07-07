@regression
Feature: MicroCenter Home Page feature
  @smoke
  Scenario: Verify Microcenter home page title
    Given I have to open chrome browser
    When I am in Microcenter home page
    Then I varify the title
    And I close the browser