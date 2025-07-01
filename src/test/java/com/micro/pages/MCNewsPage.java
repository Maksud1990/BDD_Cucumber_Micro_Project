package com.micro.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MCNewsPage {
WebDriver dr;
	public MCNewsPage(WebDriver dr) {
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
	@FindBy(xpath="//a[@href='/site/mc-news/default.aspx'][normalize-space()='Micro Center News']")WebElement mcNewsButt;
	public void clickOnMCNewsButt() {
		mcNewsButt.click();
		//return new SignInPage(dr);
	}
	}


