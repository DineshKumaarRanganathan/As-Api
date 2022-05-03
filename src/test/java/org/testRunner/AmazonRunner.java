package org.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\amazon.feature", 
				glue="org.amazonStepDefinition", dryRun=false,
				monochrome=true)
public class AmazonRunner {	

}
