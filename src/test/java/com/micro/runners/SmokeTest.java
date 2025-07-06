package com.micro.runners;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/java/com/micro/features"},
		glue={"com.micro.steps"},
		monochrome=true,
		tags={"@smoke"},
		plugin = {"json:target/cucumber-reports/Cucumber.json","pretty","de.monochromata.cucumber.report.PrettyReports:target/cucumber","html:target/pretty-cucumber"}
		//strict = true
		//dryRun=false
		//tags= {"@Login"}
		
		)

public class SmokeTest extends AbstractTestNGCucumberTests  {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("$$$$$$$$$$$Running before suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("=====Running after suite=====");
	}

}
