package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Feature_Files/" }, // feature file or folder name
		glue = { "StepDefinitionFiles" }, 
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		monochrome = true, publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
