Feature: Micro Center News Page Functionality

  As a Micro Center visitor
  I want to explore the MC News page
  So that I can stay updated with the latest tech news and Micro Center announcements

  Background:
    Given I have to open chrome browser
    When I am in Microcenter home page
   

  Scenario: Verify MC News page loads
  And i click on MCNewsPage button
    Then I should see the title "Micro Center News"
    And I should click on Micro Center News

  #Scenario: View a featured news article
    #When I click on a featured article from the top section
    #Then I should be navigated to the article details page
    #And I should see the article title, image, author, and full content
#
  #Scenario: Filter news by category
    #When I select the category "Tech Tips" from the category filter dropdown
    #Then I should see only articles related to "Tech Tips"
    #And each article card should show a "Tech Tips" label or tag
#
  #Scenario: Use search to find news
    #When I enter "Gaming PC builds" in the MC News search bar
    #And I press enter
    #Then I should see a list of articles containing the keyword "Gaming PC builds"
#
  #Scenario: View article date and author
    #When I open any news article
    #Then I should see the publication date
    #And I should see the author's name or "By Micro Center Staff"
#
  #Scenario: Navigate back to MC News home
    #When I click the "Back to News" or "MC News" breadcrumb
    #Then I should return to the main MC News article list
