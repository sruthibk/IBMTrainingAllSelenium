package testRun;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".\\IBM_Feature\\",
		glue="tests",
		tags="@ibm_regression",
		plugin = {"pretty", "html:target/ibm_CucumberReport.html"} 

)

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	

}
