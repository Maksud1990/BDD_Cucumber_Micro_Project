package com.micro.steps;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.http.DumpHttpExchangeFilter;

import com.micro.base.FileReading;
import com.micro.pages.ApplePage;
import com.micro.pages.ComputersPage;
import com.micro.pages.HelpPage;
import com.micro.pages.MCNewsPage;
import com.micro.pages.MicrocenterHomePage;
import com.micro.pages.PCPartsPage;
import com.micro.pages.PriorityCarePage;
import com.micro.pages.ServicesPage;
import com.micro.pages.SignInPage;
import com.micro.pages.TopDealsPage;
import com.micro.utils.Utility;
import com.micro.base.Browser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.messages.internal.com.google.protobuf.DescriptorProtos.MethodDescriptorProto;

public class StepDefinition {
	MicrocenterHomePage mhp;
	TopDealsPage tdp;
	PCPartsPage ppp;

	Properties pr= FileReading.readFromProperties("src\\main\\resources\\File.properties");
	WebDriver dr;

	@Given("I have to open chrome browser")
	public void i_have_to_open_chrome_browser() {
		dr=Browser.openBrowser((String) pr.get("chromeBrowser"));      
	}

	@When("I am in Microcenter home page")
	public void i_am_in_Microcenter_home_page() {
		dr.get((String) pr.get("url")); 
	}

	@Then("I varify the title")
	public void i_varify_the_title() {
		String ehpt=dr.getTitle();
		String ahpt="Micro Center - Computer & Electronics Retailer - Shop Now";
		Utility.verify(ehpt, ahpt);
	}

	@And("I close the browser")
	public void i_close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
		dr.quit();
	}
	@Given("I navigate to the Micro Center website")
	public void i_navigate_to_the_Micro_Center_website() {
		dr=Browser.openBrowser((String) pr.get("chromeBrowser"));      
	}

	@And("I click on the Top Deals link in the navigation")
	public void i_click_on_the_Top_Deals_link_in_the_navigation() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.clickTopDealsButton();
	}



	@Then("I should see the {string} logo")
	public void i_should_see_the_logo(String string) {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		TopDealsPage tdp=new TopDealsPage(dr);
		tdp.displayedkOnTopDealsLogo();



	}

	@And("I should click the shop laptop saving event")
	public void i_should_click_the_shop_laptop_saving_event() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		TopDealsPage tdp=new TopDealsPage(dr);

		tdp.clickOnShopLaptopSavingEvenButton();
	}

	@And("I should see the laptop saving event")
	public void i_should_see_the_laptop_saving_event() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		TopDealsPage tdp=new TopDealsPage(dr);
		tdp.displayedkOnlaptopSavingEventLogo();


	}

	@And("I click on view card")
	public void i_click_on_view_card() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);

		TopDealsPage tdp=new TopDealsPage(dr);
		tdp.switchWindow();
		tdp.clickOnViewCardButton();


	}

	@And("I click on add to card")
	public void i_click_on_add_to_card() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);

		TopDealsPage tdp=new TopDealsPage(dr);
		tdp.switchWindow();

		tdp.clickOnAddToCardButton();

	}
	@And("I click on proceed to card")
	public void i_click_on_proceed_to_card() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@And("i click on cheackout button")
	public void i_click_on_cheackout_button() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);

		TopDealsPage tdp=new TopDealsPage(dr);
		tdp.switchWindow();
		tdp.clickOnCheckoutButton();

	}

	@When("I put on email address")
	public void i_put_on_email_address() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);

		TopDealsPage tdp=new TopDealsPage(dr);
		tdp.switchWindow();
		tdp.clickOnEmailAddressButton();

	}

	@And("Put on password")
	public void put_on_password() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);

		TopDealsPage tdp=new TopDealsPage(dr);
		tdp.switchWindow();
		tdp.clickOnPasswordButton();

	}

	@Then("click on sign in button")
	public void click_on_sign_in_button() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);

		TopDealsPage tdp=new TopDealsPage(dr);
		tdp.switchWindow();
		tdp.clickOnSignInButton();
	}

	@Given("I am on the Micro Center PC Parts page")
	public void i_am_on_the_Micro_Center_PC_Parts_page() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.clickOnPCPartsButton();

	}

	@When("I click on the first intel CPUS item")
	public void i_click_on_the_first_intel_CPUS_item() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		PCPartsPage ppp=new PCPartsPage(dr);
		ppp.clickOnIntelCPUSButton();
	}
	@Given("User is on the Micro Center home page")
	public void user_is_on_the_Micro_Center_home_page() {
		dr.get((String) pr.get("url"));
	}

	@When("User navigates to the {string} page")
	public void user_navigates_to_the_page(String string) {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.clickOnComputersButton();
	}

	@When("User selects {string} from the category filters")
	public void user_selects_from_the_category_filters(String string) {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		ComputersPage cPage=new ComputersPage(dr);
		cPage.clickOnGammingDeskstopsButton();
	}

	@When("User selects G453 Gaming PC from the list")
	public void user_selects_G453_Gaming_PC_from_the_list() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ComputersPage cPage=new ComputersPage(dr);
		cPage.switchWindow();

		cPage.clickOnGammingPCButton();

	}

	@When("I click on Add To Card")
	public void i_click_on_Add_To_Card() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ComputersPage cPage=new ComputersPage(dr);
		cPage.switchWindow();
		cPage.clickOnAddToCardButt();

	}

	@When("I click on ViewCard")
	public void i_click_on_ViewCard() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ComputersPage cPage=new ComputersPage(dr);
		cPage.switchWindow();
		cPage.clickOnViewCardButt();

	}




	@When("I click on checkout as guest")
	public void i_click_on_checkout_as_guest() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ComputersPage cPage=new ComputersPage(dr);
		cPage.switchWindow();
		cPage.clickOnCheckoutAsGuestButton();
	}

	@When("I put on FirstName")
	public void i_put_on_FirstName() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ComputersPage cPage=new ComputersPage(dr);
		cPage.switchWindow();
		cPage.clickOnFirstName();
	}

	@When("I put on LastName")
	public void i_put_on_LastName() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ComputersPage cPage=new ComputersPage(dr);
		cPage.switchWindow();
		cPage.clickOnLastName();
	}

	@When("I put On Email Address")
	public void i_put_On_Email_Address() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ComputersPage cPage=new ComputersPage(dr);
		cPage.switchWindow();
		cPage.clickOnEmail();
	}

	@When("I put on Phone Number")
	public void i_put_on_Phone_Number() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ComputersPage cPage=new ComputersPage(dr);
		cPage.switchWindow();
		cPage.clickOnPhoneNumber();
	}

	@When("I click on Continue Button")
	public void i_click_on_Continue_Button() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ComputersPage cPage=new ComputersPage(dr);
		cPage.switchWindow();
		cPage.clickOnContinueButton();
	}

	@Then("The product should be added to the cart successfully")
	public void the_product_should_be_added_to_the_cart_successfully() {

	}
	@When("I click on ApplePage button")
	public void i_click_on_ApplePage_button() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.clickOnAppleButton();
	}

	@Then("I varify the ApplePage title")
	public void i_varify_the_ApplePage_title() {
		String ehpt=dr.getTitle();
		String ahpt="Apple Showcase | Micro Center";
		Utility.verify(ehpt, ahpt);
	}


	@And("Click on Apple TV")
	public void click_on_Apple_TV() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);


		ApplePage ap=new ApplePage(dr);
		ap.switchWindow();
		ap.clickOnAppleTVButton();
	}

	@And("Click on AddToCard")
	public void click_on_AddToCard() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);

		mhp.switchWindow();
		ApplePage ap=new ApplePage(dr);
		ap.switchWindow();
		ap.clickOnAddToCardB();
	}

	@And("click on ViewCard")
	public void click_on_ViewCard() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);

		mhp.switchWindow();
		ApplePage ap=new ApplePage(dr);
		ap.switchWindow();
		ap.clickOnViewCardB();
	}

	@And("Click on CheckOut")
	public void click_on_CheckOut() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);


		ApplePage ap=new ApplePage(dr);
		ap.switchWindow();
		ap.clickOnCheckoutB();
	}

	@And("Now I have to type username as {string}")
	public void now_I_have_to_type_username_as(String string) {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);

		mhp.switchWindow();
		ApplePage ap=new ApplePage(dr);
		ap.switchWindow();
		ap.clickOnUsername();
	}

	@And("Next I have to type password as {string}")
	public void next_I_have_to_type_password_as(String string) {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);

		mhp.switchWindow();
		ApplePage ap=new ApplePage(dr);
		ap.switchWindow();
		ap.clickOnPassword();
	}

	@And("I click on SignIn button")
	public void i_click_on_SignIn_button() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);

		mhp.switchWindow();
		ApplePage ap=new ApplePage(dr);
		ap.switchWindow();
		ap.clickOnSignInB();
	}
	@When("I click on SignIn Button")
	public void i_click_on_SignIn_Button() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.clickOnSignInButton();
	}
	@Then("click on signin again")
	public void click_on_signin_again() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		mhp.clickOnSignInAgain();


	}

	@Then("I verify the SignIn page title")
	public void i_verify_the_SignIn_page_title() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);

		SignInPage sp=new SignInPage(dr);
		sp.switchWindow();
		String ehpt=dr.getTitle();
		String ahpt="Sign In - Micro Center";
		Utility.verify(ehpt, ahpt);

	}

	@Then("I enter username as {string}")
	public void i_enter_username_as(String string) {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
        SignInPage sp=new SignInPage(dr);
		sp.userName("mdrhmn7@yahoo.com");
	}

	@Then("I enter password as {string}")
	public void i_enter_password_as(String string) {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();

		SignInPage sp=new SignInPage(dr);

		sp.clickOnPassword("Mahir2004");
	}

	@When("I click on SIGN IN button")
	public void i_click_on_SIGN_IN_button() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();

		SignInPage sp=new SignInPage(dr);

		sp.clickOnSignInButton();
	}
	@When("I click on the {string} link from the navigation menu")
	public void i_click_on_the_link_from_the_navigation_menu(String string) {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.clickOnServicesButton();
	}

	@Then("I should see the Services page title as {string}")
	public void i_should_see_the_Services_page_title_as(String string) {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		String ehpt=dr.getTitle();
		String ahpt="Laptop and Computer Repair Services - Micro Center";
		Utility.verify(ehpt, ahpt);
	}


	@When("I scroll down to the {string} section")
	public void i_scroll_down_to_the_section(String string) {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnCheckRepairStatusButton();
		
		
	}

	@Then("I should see the Service Oder Status Logo")
	public void i_should_see_the_Service_Oder_Status_Logo() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.onserviceOrderStatusLogo();
	}
	@Then("click on Schedule service")
	public void click_on_Schedule_service() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnScheduleServicesButton();
	}

	@Then("click on All service & Repair")
	public void click_on_All_service_Repair() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnServiceRepairButton();
	}

	@Then("click on Computer Repair")
	public void click_on_Computer_Repair() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnComputerRepairButton();
	}

	@Then("click on Brands we service")
	public void click_on_Brands_we_service() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnBrandsServiceButton();
	}

	@Then("click on Laptop Battery Replacement")
	public void click_on_Laptop_Battery_Replacement() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnBateryRelacementButton();
	}

	@Then("click on Laptop Screen replacement")
	public void click_on_Laptop_Screen_replacement() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnScreenRelacementButton();
	}

	@Then("click on Apple Certified Repair")
	public void click_on_Apple_Certified_Repair() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnCertifiedRepairButton();
	}

	@Then("click on GPU Trade-in Program")
	public void click_on_GPU_Trade_in_Program() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnTradeProgramButton();
	}

	@Then("click on Recycling Program")
	public void click_on_Recycling_Program() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
				sp.switchWindow();;
		sp.clickOnRecyclingProgramButton();
	}

	@Then("click on Virus Removal")
	public void click_on_Virus_Removal() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnVirusRemovalButton();
	}

	@Then("click on Data Recovery")
	public void click_on_Data_Recovery() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnDataRecoverylButton();
	}

	@Then("click on Custom Bill PCS")
	public void click_on_Custom_Bill_PCS() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnBillPCSlButton();
	}

	@Then("click on Service FAQs")
	public void click_on_Service_FAQs() {
		MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
		mhp.switchWindow();
		ServicesPage sp=new ServicesPage(dr);
		sp.switchWindow();
		sp.clickOnServiceFAQsButton();
	}

@When("I click on Priority Care")
public void i_click_on_Priority_Care() {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.switchWindow();
	mhp.clickOnPriorityCareButton();
}

@Then("I should see the page title as {string}")
public void i_should_see_the_page_title_as(String string) {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.switchWindow();
	PriorityCarePage pp=new PriorityCarePage(dr);
	String eppt=dr.getTitle();
	String appt="PriorityCare+ | Your Tech Support Solution";
	Utility.verify(appt, eppt);
    
}

@And("I should see a heading {string}")
public void i_should_see_a_heading(String string) {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.switchWindow();
	PriorityCarePage pp=new PriorityCarePage(dr);
	pp.switchWindow();
	pp.onMembershipBenifit();
}

@When("I click the Unlimited In-Store & Remote Tech Support button under any benefit")
public void i_click_the_Unlimited_In_Store_Remote_Tech_Support_button_under_any_benefit() {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.switchWindow();
	PriorityCarePage pp=new PriorityCarePage(dr);
	pp.switchWindow();
	pp.clickOnTechSupport();
}

@Then("I click the Unlimited Diagnostic Services button under any benefit")
public void i_click_the_Unlimited_Diagnostic_Services_button_under_any_benefit() {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.switchWindow();
	PriorityCarePage pp=new PriorityCarePage(dr);
	pp.switchWindow();
	pp.clickOnDiagnosticServices();
}

//@Then("I click the Unlimited Troubleshooting and Training button")
//public void i_click_the_Unlimited_Troubleshooting_and_Training_button() {
//	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
//	mhp.switchWindow();
//	PriorityCarePage pp=new PriorityCarePage(dr);
//	pp.switchWindow();
//	pp.clickOnTrainingButton();
//}


@Then("I click on {string} button")
public void i_click_on_button(String string) {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.switchWindow();
	PriorityCarePage pp=new PriorityCarePage(dr);
	pp.switchWindow();
	pp.clickOnTrainingButton();
    
}


@Then("I click the Cloud Storage button under any benefit")
public void i_click_the_Cloud_Storage_button_under_any_benefit() {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.switchWindow();
	PriorityCarePage pp=new PriorityCarePage(dr);
	pp.switchWindow();
	pp.clickOnStorageButton();
}

@Then("I click the Additional Tech Benefits button under any benefit")
public void i_click_the_Additional_Tech_Benefits_button_under_any_benefit() {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.switchWindow();
	PriorityCarePage pp=new PriorityCarePage(dr);
	pp.switchWindow();
	pp.clickOnAdditionalTechButton();
}
@When("I click on help page button")
public void i_click_on_help_page_button() {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.clickOnHelpPageButton();
}

@Then("I should see the title as {string}")
public void i_should_see_the_title_as(String string) {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.switchWindow();
	HelpPage hPage=new HelpPage(dr);
	hPage.switchWindow();
	String ehpTitle=dr.getTitle();
	String ahpTitle="Help Center | Micro Center";
	Utility.verify(ahpTitle, ehpTitle);
}

@Then("I should see the customer service logo")
public void i_should_see_the_customer_service_logo() {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.switchWindow();
	HelpPage hPage=new HelpPage(dr);
	hPage.switchWindow();
	hPage.OncustomerServiceLogo();
}
@When("i click on MCNewsPage button")
public void i_click_on_MCNewsPage_button() {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.clickOnMCNewsButton();
}

@Then("I should see the title {string}")
public void i_should_see_the_title(String string) {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.switchWindow();
	MCNewsPage mcNewsPage=new MCNewsPage(dr);
	mcNewsPage.switchWindow();
	String emcnpTitle=dr.getTitle();
	String amcnTitle="Micro Center News";
	Utility.verify(emcnpTitle, amcnTitle);
}

@Then("I should click on Micro Center News")
public void i_should_click_on_Micro_Center_News() {
	MicrocenterHomePage mhp=new MicrocenterHomePage(dr);
	mhp.switchWindow();
	MCNewsPage mcNewsPage=new MCNewsPage(dr);
	mcNewsPage.switchWindow();
	mcNewsPage.clickOnMCNewsButt();
}

















}


