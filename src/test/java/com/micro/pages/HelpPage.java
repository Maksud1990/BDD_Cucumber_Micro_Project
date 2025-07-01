package com.micro.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {
	WebDriver dr;
	public HelpPage(WebDriver dr) {
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
	@FindBy(xpath="//h1[normalize-space()='Customer Service']")WebElement customerServiceLogo;
	public void OncustomerServiceLogo() {
		customerServiceLogo.click();
	}
	@FindBy(xpath="//a[@id='midLvl15468']")WebElement helpPageButton;
	public MCNewsPage clickOnHelpPageButton() {
		helpPageButton.click();
		return new MCNewsPage(dr);
	}

}
