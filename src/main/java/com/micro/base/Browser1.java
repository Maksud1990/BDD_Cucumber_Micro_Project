package com.micro.base;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver=new EdgeDriver();
		driver.get("https://www.microcenter.com/");
		driver.findElement(By.xpath("//input[@id='search-query']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@title='search for products']")).click();
		
		driver.findElement(By.xpath("//img[@alt='LAPTOP SAVINGS EVENT! Shop Over 150 Laptops - Dell Inspiron 15 3530 15.6 inch Laptop - $559.99 Save $250; Intel Core i7 1355U (1.2GHz), 16GB DDR4-2666 RAM, Intel Iris Xe Integrated Graphics, Microsoft Windows 11 Pro, 1TB PCIe NVMe M.2 SSD, 15.6 inch Full HD WVA Touchscreen Anti-Glare Display; SKU 684449; SHOP ALL']")).click();
//		driver.findElement(By.xpath("//button[@aria-label='open drawer to view Shop All']//div[@class='sui-flex']//*[name()='svg']")).click();
//		driver.findElement(By.xpath("//*[@id=\"typeahead-search-field-input\"]")).sendKeys("Electric item");
//		driver.findElement(By.xpath("//button[@id='typeahead-search-icon-button']")).click();
//		
		
		
		
		//driver.findElement(By.xpath(""))
//		String title=driver.getTitle();
//		System.out.println(title);
//		driver.findElement(By.xpath("//a[@id='midLvl18283']")).click();
//		
//		
//		
//		driver.findElement(By.xpath(" //img[@alt='TOP DEALS']")).isDisplayed();
//		driver.findElement(By.xpath("//a[@id='midLvl18213']")).click();

}
}