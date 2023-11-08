package basics.training;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	
	public void verifysearchfeature() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	}

}
