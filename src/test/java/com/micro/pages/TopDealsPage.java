package com.micro.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v124.input.model.DragData;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TopDealsPage {
	WebDriver dr;

	public TopDealsPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath=(" //img[@alt='TOP DEALS']"))WebElement topDealsLogo;
    public void displayedkOnTopDealsLogo() {
    	topDealsLogo.isDisplayed();
    	

}
    
    @FindBy(xpath=("//a[normalize-space()='SHOP LAPTOP SAVINGS EVENT »']"))WebElement shopLaptopSavingEvenButton;
    public void clickOnShopLaptopSavingEvenButton() {
    	shopLaptopSavingEvenButton.click();

}
    @FindBy(xpath=(" //img[@alt='LAPTOP SAGINS EVENT - SHOP over 150 Desktops']"))WebElement laptopSavingEventLogo;
    public void displayedkOnlaptopSavingEventLogo() {
    	laptopSavingEventLogo.isDisplayed();
    }
//    @FindBy(xpath=(" //li[@id='pwrapper_3']//a[@class='btn-add quickView']"))WebElement quickViewButton;
//    public void clickOnQuickViewButton() {
//    	quickViewButton.click();
//
//}
    
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
    

	
//	 @FindBy(xpath="//a[@id='midLvl18213']")WebElement pcPartsButton;
//	    public PCPartsPage clickOnPCPartsButton() {
//	    	pcPartsButton.click();
//	    	return new PCPartsPage(dr);
//	    
//	    }


}