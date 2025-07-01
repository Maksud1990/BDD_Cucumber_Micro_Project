package com.micro.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver dr;
	public SignInPage(WebDriver dr) {
		
	

		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	public WebDriver switchWindow() {

		String firstwindow = dr.getWindowHandle();
		Set<String> windows = dr.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String window = itr.next();

			dr.switchTo().window(window);
		}
		return dr;

	}

//	@FindBy(xpath="//a[@id='hypSignIn']")WebElement signInAgain;
//	public void clickOnSignInAgain() {
//		signInAgain.click();
//	
	
	//}


	@FindBy(xpath="//input[@id='username']")WebElement emailaddres;
	
	public void OnEmailAddress() {
		emailaddres.sendKeys("mdrhmn7@yahoo.com");
	}
	

	@FindBy(xpath="//input[@id='Username']")WebElement username;
	public void userName(String Username) {
		username.sendKeys("mdrhmn7@yahoo.com");
	}


	@FindBy(xpath="//input[@id='Password']")WebElement password;
	public void clickOnPassword(String Password) {
		password.sendKeys("Mahir2004");
	
	
	}
	@FindBy(xpath="//button[@id='signInBtn']")WebElement signInButton;
    public void clickOnSignInButton() {
    	signInButton.click();
    }
}
