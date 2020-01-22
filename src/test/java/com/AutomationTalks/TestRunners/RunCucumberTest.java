package com.AutomationTalks.TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Freatures"},
				glue = {"com\\AutomationTalks\\stepDefinations", 
						"com\\AutomationTalks\\Utils"}, //specify hooks location if not present in the same package as step defs
		plugin = {"json:target/cucumber-report.json",
		"html:target/cucumber-report.html"}
		)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}