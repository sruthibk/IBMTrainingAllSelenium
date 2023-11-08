package testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\IBM_Feature\\",
		glue="tests",
	    plugin = {"pretty", "html:target/ibm_CucumberReport.html"} 

)

public class TestRunner{
	
	
	

}
