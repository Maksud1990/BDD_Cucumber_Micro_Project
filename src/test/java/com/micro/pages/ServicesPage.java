package com.micro.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {
	WebDriver dr;
	public ServicesPage(WebDriver dr) {
		
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
	@FindBy(xpath="//a[@id='midLvl24724']")WebElement checkRepairStatusButton;
	public void clickOnCheckRepairStatusButton() {
		checkRepairStatusButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl18223']")WebElement scheduleServicesButton;
	public void clickOnScheduleServicesButton() {
		scheduleServicesButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl18224']")WebElement serviceRepairButton;
	public void clickOnServiceRepairButton() {
		serviceRepairButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl18232']")WebElement computerRepairButton;
	public void clickOnComputerRepairButton() {
		computerRepairButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl26356']")WebElement brandsServiceButton;
	public void clickOnBrandsServiceButton() {
		brandsServiceButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl18234']")WebElement bateryRelacementButton;
	public void clickOnBateryRelacementButton() {
		bateryRelacementButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl18237']")WebElement screenRelacementButton;
	public void clickOnScreenRelacementButton() {
		screenRelacementButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl24778']")WebElement certifiedRepairButton;
	public void clickOnCertifiedRepairButton() {
		certifiedRepairButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl22308']")WebElement tradeProgramButton;
	public void clickOnTradeProgramButton() {
		tradeProgramButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl25301']")WebElement recyclingProgramButton;
	public void clickOnRecyclingProgramButton() {
		recyclingProgramButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl18233']")WebElement virusRemovalButton;
	public void clickOnVirusRemovalButton() {
		virusRemovalButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl24777']")WebElement dataRecoverylButton;
	public void clickOnDataRecoverylButton() {
		dataRecoverylButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl18236']")WebElement billPCSlButton;
	public void clickOnBillPCSlButton() {
		billPCSlButton.click();
	}
	@FindBy(xpath="//a[@id='midLvl24536']")WebElement serviceFAQsButton;
	public void clickOnServiceFAQsButton() {
		serviceFAQsButton.click();
	}
	@FindBy(xpath="//h1[normalize-space()='Service Order Status']")WebElement serviceOrderStatusLogo;
	public void onserviceOrderStatusLogo() {
		serviceOrderStatusLogo.isDisplayed();
	}
//		@FindBy(xpath="//a[@id='midLvl25779']4780']")WebElement priorityCareButton;
//		public PriorityCarePage clickOnPriorityCareButton() {
//			priorityCareButton.click();
//			return new PriorityCarePage(dr);
//		}

	}


