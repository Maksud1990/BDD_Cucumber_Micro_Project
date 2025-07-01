package com.micro.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriorityCarePage {
WebDriver dr;
	public PriorityCarePage(WebDriver dr) {
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
	@FindBy(xpath="//h2[normalize-space()='Tech Support Membership Benefits']")WebElement membershipBenifit;
	public void onMembershipBenifit() {
		membershipBenifit.isDisplayed();
	}
	@FindBy(xpath="//span[@class='hideUnlimited']")WebElement techSupport;
	public void clickOnTechSupport() {
		techSupport.click();
	}
	@FindBy(xpath="//span[normalize-space()='Unlimited Diagnostic Services']")WebElement diagnosticServices;
	public void clickOnDiagnosticServices() {
		diagnosticServices.click();
	}
	@FindBy(xpath="//span[contains(text(),'Unlimited Troubleshooting and Training​')]")WebElement trainingButton;
	public void clickOnTrainingButton() {
		trainingButton.click();
	}
	@FindBy(xpath="//div[@class='row groupRepair Head']//div[@class='column1']")WebElement storageButton;
	public void clickOnStorageButton() {
		storageButton.click();
	}
	@FindBy(xpath="//span[normalize-space()='Additional Tech Benefits']")WebElement additionalTechButton;
	public void clickOnAdditionalTechButton() {
		additionalTechButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl15468']")WebElement helpPageButton;
	public HelpPage clickOnHelpPageButton() {
		helpPageButton.click();
		return new HelpPage(dr);
	}
	}


