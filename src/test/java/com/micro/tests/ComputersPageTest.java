package com.micro.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.micro.base.Base;
import com.micro.base.Browser;
import com.micro.base.FileReading;
import com.micro.pages.ComputersPage;
import com.micro.pages.MicrocenterHomePage;
import com.micro.utils.Utility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputersPageTest extends Base {
//
//	Properties pr= FileReading.readFromProperties("src\\main\\resources\\File.properties");
//	WebDriver dr;
//	@Test(priority = 1)
//
//	public void varifyOpenChromeBrowser() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		dr=Browser.openBrowser((String) pr.get("chromeBrowser"));
//	}
//	@Test(priority = 2)
//	public void varifyClickOnComputerPage() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		mhp.clickOnComputersButton();
//
//	}
//	@Test(priority = 3)
//	public void varifyComputerPageTitle() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		ComputersPage cPage=new ComputersPage(dr);
//		String ecpt=dr.getTitle();
//		String acpt="Computers for Sale: PC Computers & More | Micro Center";
//		Utility.verify(ecpt, acpt);
//
//	}
//	@Test(priority = 4)
//	public void varifyComputerPageCurrentURL() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		String epcpURL=dr.getCurrentUrl();
//		String apcpURL="https://www.microcenter.com/site/products/computers.aspx";
//		Utility.verify(apcpURL, epcpURL);
//
//	}
//	@Test(priority = 5)
//	public void varifyClickOnComputersButton() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		mhp.clickOnComputersButton();
//	}
//	@Test(priority = 6)
//	public void varifyClickOnGammingDeskstopsButton() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		ComputersPage cPage=new ComputersPage(dr);
//		cPage.clickOnGammingDeskstopsButton();
//	}
//	@Test(priority = 7)
//
//	public void varifyClickOnGammingPCButton() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		mhp.switchWindow();
//		ComputersPage cPage=new ComputersPage(dr);
//		cPage.switchWindow();
//
//		cPage.clickOnGammingPCButton();
//
//		
//
//	}
//	@Test(priority = 8)
//
//	public void varifyClickOnAddToCardButt() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		mhp.switchWindow();
//		ComputersPage cPage=new ComputersPage(dr);
//		cPage.switchWindow();
//		cPage.clickOnAddToCardButt();
//
//	}
//	@Test(priority = 9)
//	public void varifyClickOnViewCardButt() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		mhp.switchWindow();
//		ComputersPage cPage=new ComputersPage(dr);
//		cPage.switchWindow();
//		cPage.clickOnViewCardButt();
//
//	}
//
//
//
//	@Test(priority = 10)
//	public void varifyClickOnCheckoutAsGuestButton() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		mhp.switchWindow();
//		ComputersPage cPage=new ComputersPage(dr);
//		cPage.switchWindow();
//		cPage.clickOnCheckoutAsGuestButton();
//	}
//	@Test(priority = 11)
//	public void varifyClickOnFirstName() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		mhp.switchWindow();
//		ComputersPage cPage=new ComputersPage(dr);
//		cPage.switchWindow();
//		cPage.clickOnFirstName();
//	}
//	@Test(priority = 12)
//	public void varifyClickOnLastName() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		mhp.switchWindow();
//		ComputersPage cPage=new ComputersPage(dr);
//		cPage.switchWindow();
//		cPage.clickOnLastName();
//	}
//	@Test(priority = 13)
//
//	public void varifyClickOnEmail() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		mhp.switchWindow();
//		ComputersPage cPage=new ComputersPage(dr);
//		cPage.switchWindow();
//		cPage.clickOnEmail();
//	}
//	@Test(priority = 14)
//
//	public void varifyClickOnPhoneNumber() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		mhp.switchWindow();
//		ComputersPage cPage=new ComputersPage(dr);
//		cPage.switchWindow();
//		cPage.clickOnPhoneNumber();
//	}
//	@Test(priority = 15)
//	public void varifyClickOnContinueButton() {
//		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//		mhp.switchWindow();
//		ComputersPage cPage=new ComputersPage(dr);
//		cPage.switchWindow();
//		cPage.clickOnContinueButton();
//	}
//
//	@Then("The product should be added to the cart successfully")
//	public void the_product_should_be_added_to_the_cart_successfully() {
//
//	}

}
