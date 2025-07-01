package com.micro.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.micro.base.Base;
import com.micro.base.Browser;
import com.micro.base.FileReading;
import com.micro.pages.MicrocenterHomePage;
import com.micro.pages.PCPartsPage;
import com.micro.pages.TopDealsPage;
import com.micro.utils.Utility;

import io.cucumber.java.en.When;

public class PCPartsPageTest extends Base {
	Properties pr= FileReading.readFromProperties("src\\main\\resources\\File.properties");
	WebDriver dr;
	@Test(priority = 1)

	public void varifyOpenChromeBrowser() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		dr=Browser.openBrowser((String) pr.get("chromeBrowser"));
	}
	@Test(priority = 2)
	public void varifyClickOnPCPartsPage() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.clickOnPCPartsButton();

	}
	@Test(priority = 3)
	public void varifyPCPartsPageTitle() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		String epcpt=dr.getTitle();
		String apcpt="Computer Parts: Shop PC Parts and Build Your Own | Micro Center";
		Utility.verify(epcpt, epcpt);

	}
	@Test(priority = 4)
	public void varifyMicrocenterHomePageCurrentURL() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		String epcpURL=dr.getCurrentUrl();
		String apcpURL="https://www.microcenter.com/site/products/computer-parts.aspx";
		Utility.verify(apcpURL, epcpURL);

	}
	@Test(priority = 5)
	public void iClickOnTheFirstIntelCPUSitem() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		PCPartsPage ppp=new PCPartsPage(dr);
		ppp.clickOnIntelCPUSButton();
	}
	@Test(priority = 6)
	public void varifyClickOnAddToCardButton() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);


		PCPartsPage ppp=new PCPartsPage(dr);
		ppp.switchWindow();

		ppp.clickOnAddToCardButton();



	}
	@Test(priority = 7)
	public void varifyClickOnViewCardButton() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);


		PCPartsPage ppp=new PCPartsPage(dr);
		ppp.switchWindow();
		ppp.clickOnViewCardButton();
	}
	@Test(priority = 8)
	public void varifyClickOnCheckoutButton() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);


		PCPartsPage ppp=new PCPartsPage(dr);
		ppp.switchWindow();
		ppp.clickOnCheckoutButton();
	}
	@Test(priority = 9)
	public void varifyClickOnEmailAddressButton() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);


		PCPartsPage ppp=new PCPartsPage(dr);
		ppp.switchWindow();
		ppp.clickOnEmailAddressButton();
	}
	@Test(priority = 10)
	public void varifyClickOnPasswordButton() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);


		PCPartsPage ppp=new PCPartsPage(dr);
		ppp.switchWindow();
		ppp.clickOnPasswordButton();


	}
	@Test(priority = 11)
	public void varifyClickOnSignInButton() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);


		PCPartsPage ppp=new PCPartsPage(dr);
		ppp.switchWindow();
		ppp.clickOnSignInButton();
	}	

}
