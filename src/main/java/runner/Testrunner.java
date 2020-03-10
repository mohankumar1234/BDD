package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( format = {"pretty" , "html:target/report"} , 
	features = "src/main/java/Feature" , glue = "StepDefinitions" , tags = "@TC10")
public class Testrunner extends AbstractTestNGCucumberTests  {
	
	

}
