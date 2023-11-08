package testRun;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".\\IBM_Feature\\",
		glue= "tests",
		tags="@ibm_smoke",
		plugin = {"pretty", "html:target/ibm_CucumberReport.html"} 

)

public class TestRunner2 extends AbstractTestNGCucumberTests{
	
	

}
