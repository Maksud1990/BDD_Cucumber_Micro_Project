package com.micro.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage {
	WebDriver dr;
	public ComputersPage(WebDriver dr) {

		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath="//h3[normalize-space()='Gaming Desktops']")WebElement gammingDeskstopsButton;
	public void clickOnGammingDeskstopsButton() {
		gammingDeskstopsButton.click();
	}
	   @FindBy(xpath=("//div[@id='options-button']//div[2]//button[1]"))WebElement addToCardButt;
	    public void clickOnAddToCardButt() {
	    	addToCardButt.click();

	}
	    @FindBy(xpath=("//a[normalize-space()='View Cart']"))WebElement viewCardButt;
	    public void clickOnViewCardButt() {
	    	viewCardButt.click();

	}
	@FindBy(xpath="//div[@class='crossSellLinkTrunc'][normalize-space()='G453 Gaming PC']")WebElement gammingPCButton;
	public void clickOnGammingPCButton() {
		gammingPCButton.click();
	}
	@FindBy(xpath="//a[normalize-space()='Checkout as Guest']")WebElement checkoutAsGuestButton;
	public void clickOnCheckoutAsGuestButton() {
		checkoutAsGuestButton.click();
	}
		@FindBy(xpath="//input[@id='firstname-input']")WebElement firstName;
		public void clickOnFirstName() {
			firstName.sendKeys("MD");;
	}
		@FindBy(xpath="//input[@id='lastname-input']")WebElement lastName;
		public void clickOnLastName() {
			lastName.sendKeys("Faisal");;
	}
		@FindBy(xpath="//input[@id='email-input']")WebElement email;
		public void clickOnEmail() {
			email.sendKeys("rahmanmaksudur1976@gmail.com");;
	}
		@FindBy(xpath="//input[@id='phone-input']")WebElement phoneNumber;
		public void clickOnPhoneNumber() {
			phoneNumber.sendKeys("7184046734");
	}

		@FindBy(xpath="//a[@id='contact-submit']")WebElement continueButton;
		public void clickOnContinueButton() {
			continueButton.click();;
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
//	@FindBy(xpath="//a[@id='midLvl18549']")WebElement appleButton;
//	public ApplePage clickOnAppleButton() {
//		appleButton.click();
//		return new ApplePage(dr);
//
	}



