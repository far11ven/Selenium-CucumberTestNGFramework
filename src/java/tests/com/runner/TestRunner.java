package com.runner;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@CucumberOptions(
		
		plugin = {"pretty", "html:target/html-report", "json:target/json-report.json", "rerun:target/rerun.txt" },
		monochrome=true,
		features="./features/feature1.feature",
		glue= {"com.steps"},
		tags="@test1")

public class TestRunner extends AbstractTestNGCucumberTests {

}
