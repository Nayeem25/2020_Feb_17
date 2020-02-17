package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Nayeem\\workspace\\ABD\\WebDriverTest\\features\\Guru99.feature",
		glue="stepDefinitions",
		format={"pretty","html:test-output"},
		dryRun=false,
		//tags={""},
		strict=true,
		monochrome=true	
		         )


public class TestRunner 
{

}
