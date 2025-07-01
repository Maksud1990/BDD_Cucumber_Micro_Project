package com.micro.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplePage {
	WebDriver dr;

	public ApplePage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath="//a[normalize-space()='Apple TV']")WebElement appleTVButton;
	public void clickOnAppleTVButton() {
		appleTVButton.click();
	}
	
	@FindBy(xpath="//button[@value='ADD TO CART']")WebElement addToCardB;
	public void clickOnAddToCardB() {
		addToCardB.click();
	}
	@FindBy(xpath="//a[normalize-space()='View Cart']")WebElement viewCardB;
	public void clickOnViewCardB() {
		viewCardB.click();
	}
	@FindBy(xpath="//button[@aria-label='link']")WebElement checkoutB;
	public void clickOnCheckoutB() {
		checkoutB.click();
	}
	@FindBy(xpath="//input[@id='Username']")WebElement username;
	public void clickOnUsername() {
		username.click();
	}
	@FindBy(xpath="//input[@id='Password']")WebElement password;
	public void clickOnPassword() {
		password.click();
	}
	@FindBy(xpath="//button[@id='signInBtn']")WebElement signInB;
	public void clickOnSignInB() {
		signInB.click();
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
//	@FindBy(xpath="//a[@id='midLvl14780']")WebElement servicesButton;
//	public ServicesPage clickOnServicesButton() {
//		servicesButton.click();
//		return new ServicesPage(dr);
//	}

}
