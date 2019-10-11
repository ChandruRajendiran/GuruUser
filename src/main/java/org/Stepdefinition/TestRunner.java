package org.Stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\org\\test\\Resource\\Gurupage.Feature",glue="org.Stepdefinition"

		,dryRun=false,monochrome=true,plugin= {"pretty"})

public class TestRunner {

	
	

}
