package com.steps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.reports.ExtentManager;

public class Steps {
	public ExtentReports extent;
	ExtentTest test;
	WebDriver driver;

	@Before
	public void Setup(){

		extent = ExtentManager.GetExtent();

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Selenium\\chromedriver.exe");


		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.google.com");

	}


	@Given("^I open URL using Chrome Browser$")
	public void I_open_URL_using_Chrome_Browser() throws Throwable {

		test = extent.createTest("Test1", "Verify HomePage");

		System.out.println("Inside Given");

		FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("D:/TC1/1.JPG"));
		test.log(Status.PASS, "Snapshot" +  test.addScreenCaptureFromPath("D:/TC1/1.jpg"));

	}


	@When("^I login by Providing UserName And Password$")
	public void i_login_by_Providing_UserName_And_Password() throws Throwable {
		
		test = extent.createTest("Testing how fail works");

		System.out.println("Inside When");
		
		FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("D:/TC1/2.JPG"));
		test.log(Status.INFO, "Snapshot" +  test.addScreenCaptureFromPath("D:/TC1/2.jpg"));
		
		extent.flush();
	}


}
