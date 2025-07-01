Feature: Micro Center Priority Care Page Functionality

  As a Micro Center customer
  I want to explore the Priority Care service
  So that I can understand and enroll in premium tech support and protection plans

  Background:
    Given I have to open chrome browser
    When I am in Microcenter home page
    

  Scenario: Verify Priority Care page loads
    When I click on Priority Care 
    Then I should see the page title as "Priority Care - Micro Center"
    And I should see a heading "Tech Support Membership Benefits"

  
@smoke
  Scenario: Click on “Learn More” button
    When I click the Unlimited In-Store & Remote Tech Support button under any benefit
    Then I click the Unlimited Diagnostic Services button under any benefit
    Then I click on "Troubleshooting and Training​" button 
    Then I click the Cloud Storage button under any benefit
    Then I click the Additional Tech Benefits button under any benefit
    And I close the browser
  