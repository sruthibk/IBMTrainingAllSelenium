package tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseTest {
WebDriver driver;
@Before
public void setUp(Scenario sch)
{
	
	System.out.println("--------------Set Up-----------"+sch.getName());
	
}

@After
public void closeApp(Scenario sch) {
	
	System.out.println("--------------Set Up-----------"+sch.getStatus());
}

}


