Feature: Micro Center Services Page Functionality

  As a user
  I want to interact with the Services page on Micro Center
  So that I can view and schedule tech services

  Background:
     Given I have to open chrome browser
    When I am in Microcenter home page
    When I click on the "Services" link from the navigation menu

  Scenario: Verify Services page loads correctly
    Then I should see the Services page title as "Services - Micro Center"
@regression
  Scenario: View available tech services
    When I scroll down to the "Check Repair Status" section
    Then I should see the Service Oder Status Logo
     And click on Schedule service
     And click on All service & Repair
     And click on Computer Repair
     And click on Brands we service
     And click on Laptop Battery Replacement
     And click on Laptop Screen replacement
     And click on Apple Certified Repair
     And click on GPU Trade-in Program
     And click on Recycling Program
     And click on Virus Removal
     And click on Data Recovery
     And click on Custom Bill PCS
     And click on Service FAQs
     And I close the browser
  #Scenario: Navigate to Repair Services
    #When I click on the "Repair Services" link
   # Then I should be navigated to the "Repair Services" page
   # And I should see the heading "Repairs and Diagnostics"

  #Scenario: Schedule a service appointment
    #When I click on "Schedule a Service"
    #Then I should be redirected to the appointment booking form
    #And the form should contain fields "Name", "Email", "Phone Number", "Device Type"

 # Scenario: Check warranty info
    #When I click on the "Check My Warranty" link
    #Then I should see a text field to enter my product's serial number

  #Scenario: Contact tech support
    #When I click on "Contact Support"
    #Then I should be navigated to the Support page
    #And I should see contact options like "Live Chat", "Phone", "Email"

