package com.micro.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PCPartsPage {
	WebDriver dr;

	public PCPartsPage(WebDriver dr) {
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
	   @FindBy(xpath=("//li[@id='pwrapper_0']//div[@class='cartadd']//button[@name='ADDtoCART']"))WebElement addToCardButton;
	    public void clickOnAddToCardButton() {
	    	addToCardButton.click();

	}
	    @FindBy(xpath=("  //a[normalize-space()='View Cart']"))WebElement viewCardButton;
	    public void clickOnViewCardButton() {
	    	viewCardButton.click();

	}
	    @FindBy(xpath=("//button[@aria-label='link']"))WebElement checkoutButton;
	    public void clickOnCheckoutButton() {
	    	checkoutButton.click();

	}
	    @FindBy(xpath=("//input[@id='Username']"))WebElement emailAddressButton;
	    public void clickOnEmailAddressButton() {
	    	emailAddressButton.sendKeys("mdrhmn7@yahoo.com");
	    }
	    @FindBy(xpath=("//input[@id='Password']"))WebElement passwordButton;
	    public void clickOnPasswordButton() {
	    	passwordButton.sendKeys("Mahir2004");
	    }
	    @FindBy(xpath=("//button[@id='signInBtn']"))WebElement signInButton;
	    public void clickOnSignInButton() {
	    	signInButton.click();
	    }

	
	
	@FindBy(xpath="//p[normalize-space()='Intel CPUs']")WebElement intelCPUSButton;
    public void clickOnIntelCPUSButton() {
    	intelCPUSButton.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	 @FindBy(xpath="//a[@id='midLvl18215']")WebElement computerssButton;
//	    public ComputersPage clickOnComputerssButton() {
//	    	computerssButton.click();
//	    	return new ComputersPage(dr);
//	    
//	    }

}
}