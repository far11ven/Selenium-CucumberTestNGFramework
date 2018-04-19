package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber-report.json"},
		features = "./src/java/tests/features/feature1.feature",
		glue={"com.steps"},
		dryRun = true, 
		monochrome = true
		
		)

public class TestRunner extends AbstractTestNGCucumberTests  {
	


}
