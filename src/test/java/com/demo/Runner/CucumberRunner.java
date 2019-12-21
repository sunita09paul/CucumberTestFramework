package com.demo.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/Vettylog.feature"},
		glue= {"com.demo.steps"},
	strict = true,
	//	dryRun= true,
		monochrome= true,
		plugin= {"pretty","html:target/reports"},
		tags = {"@smoke2"}
	)
public class CucumberRunner {
	

}
