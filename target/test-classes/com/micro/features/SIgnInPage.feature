@regression
Feature: Microcenter Sign In validation 
Background:
		Given I have to open chrome browser
    When I am in Microcenter home page  
@regression
	Scenario: Verify Microcenter Sign in is working or not
	  And I click on SignIn Button
	  Then click on signin again
	 
		Then I verify the SignIn page title 
		And I enter username as "user1"
		And I enter password as "pass1"
		When I click on SIGN IN button
		And I close the browser
	@mytest
	Scenario: Verify Microcenter Sign in is working or not
	  And I click on SignIn Button
	  Then click on signin again
		Then I verify the SignIn page title 
	
		And I enter username as "user2"
		And I enter password as "pass2"
		When I click on SIGN IN button
		And I close the browser
		@smoke
	Scenario: Verify Microcenter Sign in is working or not
	  And I click on SignIn Button
	  Then click on signin again
		Then I verify the SignIn page title 
		And I enter username as "user3"
		And I enter password as "pass3"
		When I click on SIGN IN button
		And I close the browser