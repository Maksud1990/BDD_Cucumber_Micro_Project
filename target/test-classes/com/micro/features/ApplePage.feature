
Feature: Microcenter Apple page testing info
	Background:
		Given I have to open chrome browser
    When I am in Microcenter home page
    @smoke
	Scenario: Verify Apple page title
		And I click on ApplePage button
		Then I varify the ApplePage title
	  And I close the browser
	@regression
	Scenario Outline: Varify  ApplePage is working or not
		And I click on ApplePage button
		And Click on Apple TV
		And Click on AddToCard
    And click on ViewCard
    And Click on CheckOut
		And Now I have to type username as "<Username>"
    And Next I have to type password as "<Password>"
    When I click on SignIn button
		And I close the browser	
		Examples:
		|username|password|
		|mdrhmn7@yahoo.com|Mahir2004	|
		|username|password|