package com.micro.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class MicrocenterHomePage {
	WebDriver dr;
	public  MicrocenterHomePage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}



	@FindBy(xpath="//a[@id='midLvl18283']")WebElement topDealsButton;
	public TopDealsPage clickTopDealsButton() {
		topDealsButton.click();
		return new TopDealsPage(dr);

	}


	//   
	//	@FindBy(xpath="//body/form[@id='Form']/div[@id='header']/div[2]/div[3]")WebElement loginButton;
	//	public void clickOnLoginButton() {
	//		loginButton.click();
	//	}
	//	@FindBy(xpath="//body/form[@id='Form']/div[@id='header']/div[2]/div[3]/ul[1]/li[1]/a[1]/section[1]/h4[1]")WebElement memberaccess;
	//	public MemberOnlinePortalPage clickOnMemberAccess() {
	//		memberaccess.click();
	//
	//		return new MemberOnlinePortalPage(dr);
	//	}
	@FindBy(xpath="//img[@alt='Find Your Perfect Windows 11 Laptop - START NOW']")WebElement perfectWindow;
	public void varifyFindYourPerfectWindows11Laptop() {
		perfectWindow.isDisplayed();
	}
	@FindBy(xpath="//div[@id='logo']//img[@alt='Micro Center']")WebElement microcenterLogo;
	public void varifyMicrocenterLogo() {
		microcenterLogo.isDisplayed();
	}
	@FindBy(xpath="//input[@id='search-query']")WebElement searchQuery;
	public void varifyClickOnSearchQuery() {
		searchQuery.sendKeys("laptop");;
	}
	@FindBy(xpath="//input[@title='search for products']")WebElement searchBtn;
	public void varifyClickOnSearchButton() {
		searchBtn.click();
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

	@FindBy(xpath="//a[@id='midLvl18213']")WebElement pcPartsButton;
	public PCPartsPage clickOnPCPartsButton() {
		pcPartsButton.click();
		return new PCPartsPage(dr);

	}


	@FindBy(xpath="//a[@id='midLvl18215']")WebElement computersButton;
	public ComputersPage clickOnComputersButton() {
		computersButton.click();
		return new ComputersPage(dr);

	} 

	@FindBy(xpath="//a[@id='midLvl18549']")WebElement appleButton;
	public ApplePage clickOnAppleButton() {
		appleButton.click();
		return new ApplePage(dr);

	}
	@FindBy(xpath="//div[@class='uname']")WebElement signInButton;
	public void clickOnSignInButton() {
		signInButton.click();
	}
	@FindBy(xpath="//a[@id='hypSignIn']")WebElement signInAgain;
	public SignInPage clickOnSignInAgain() {
		signInAgain.click();
		return new SignInPage(dr);
	}

	@FindBy(xpath="//a[@id='midLvl14780']")WebElement servicesButton;
	public ServicesPage clickOnServicesButton() {
		servicesButton.click();
		return new ServicesPage(dr);
	}
	@FindBy(xpath="//a[@id='midLvl25779']")WebElement priorityCareButton;
	public PriorityCarePage clickOnPriorityCareButton() {
		priorityCareButton.click();
		return new PriorityCarePage(dr);
	}

@FindBy(xpath="//a[@id='midLvl15468']")WebElement helpPageButton;
public MCNewsPage clickOnHelpPageButton() {
	helpPageButton.click();
	return new MCNewsPage(dr);
}
@FindBy(xpath="//a[@id='midLvl22973']")WebElement mcNewsButt;
public SignInPage clickOnMCNewsButton() {
	mcNewsButt.click();
	return new SignInPage(dr);
}


}
