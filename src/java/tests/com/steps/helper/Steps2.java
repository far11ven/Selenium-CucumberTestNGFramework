package com.steps.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.steps.Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps2 {
	
	
	@Then("^I validate title$")
	public void i_validate_title() throws Throwable {
		
		System.out.println("Inside Then");
	    
	}
	
	@After
	public void Setup(){
		
		
		System.out.println("Inside After");
		
		Steps st = new Steps();

		
		
	}

}
