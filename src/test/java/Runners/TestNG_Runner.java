package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//dryRun = true,
		features ={"src/test/java/Features/ebay.feature"},
		glue = "StepDefinitions",
		plugin= {"pretty","html:target/htmlreport/cucumberReport.html","json:target/jsonreport/json"}
		)

public class TestNG_Runner extends AbstractTestNGCucumberTests{

}
