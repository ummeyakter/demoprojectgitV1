package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//dryRun = true,
		features ={"src/test/java/Features/ebay.feature"},
		glue = "StepDefinitions",
		plugin= {"pretty","html:target/htmlreport/cucumberReport.html","json:target/jsonreport/json"},
		monochrome=true,
		tags = "@Adhoc and @Regression"
		)

public class Junit_Runner {

}
