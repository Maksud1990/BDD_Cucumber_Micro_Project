package com.micro.base;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.micro.base.Browser;

public class Base {
	public static HashMap<String,WebDriver> hm=new HashMap<String,WebDriver>();
	public  WebDriver dr;
	//@Parameters({"browser"})
	@BeforeMethod
	public void openB() throws InterruptedException{

		dr=Browser.openBrowser("chrome");
		Thread.sleep(3000);

		dr.get("https://www.microcenter.com/");
	}
	@AfterMethod
	public void closeB() {
		dr.quit();
	}
//		@BeforeSuite
//		public void beforeSuite() {
//			System.out.println("BS");
//		}
//		@AfterSuite
//		public void afterSuite() {
//			System.out.println("AS");
//		}
//		
//		@BeforeTest
//		public void beforeTest() {
//			System.out.println("BT");
//		}
//		@AfterTest
//		public void afterTest() {
//			System.out.println("AT");
//		}
//	
//		@BeforeClass
//		public static void beforeC() {
//			System.out.println("BC");
//		}
//		@AfterClass
//		public static void afterC() {
//			System.out.println("AC");
//		}


}
