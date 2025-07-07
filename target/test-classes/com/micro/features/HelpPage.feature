Feature: Micro Center Help Page Functionality

  As a user
  I want to access and use the Help page on Micro Center
  So that I can get assistance with products, orders, and services

  Background:
    Given I have to open chrome browser
    When I am in Microcenter home page
    

  Scenario: Verify Help page loads successfully
  And I click on help page button
    Then I should see the title as "Help Center | Micro Center"
    And I should see the customer service logo
    
    
  #Scenario: Search for a help topic
    #When I enter "return policy" in the Help search bar
    #And I click the search icon or press enter
    #Then I should see a list of articles related to "return policy"
    #And the first result should contain the text "Micro Center Return Policy"

  

  #Scenario: Access “Returns & Exchanges” help topic
    #When I click on the "Returns & Exchanges" category
    #Then I should see a list of FAQs and help articles under that category
    #And I should see a heading "Returns & Exchanges"
#
  #
#
  #Scenario: Navigate to live chat
    #When I click on the "Chat with an Agent" button
    #Then a live chat window should appear or a chat page should load
    #And I should see the message "Welcome to Micro Center Support Chat"
