package locatorexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Constants;

public class HRMLogin {
	
	WebDriver driver;
	
	@Before
	public void launchAPP() {
		
		driver = new ChromeDriver();
		driver.get(Constants.hrm_app);
		driver.manage().window().maximize();
		
	}
	
	@After

    public void closeApp() throws Exception {

        Thread.sleep(5000);
        driver.close();

    }
	
	@Test
	public void verifyLoginfeature() throws InterruptedException {
		Thread.sleep(3000);
		
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("Admin");
		
	    WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("admin123");
	    
	    WebElement submitBtn = driver.findElement(By.tagName("button"));
	    submitBtn.click();
	    Thread.sleep(3000);
	    
	    WebElement dropdown = driver.findElement(By.className("oxd-userdropdown-name"));
	    dropdown.click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.partialLinkText("ogou")).click();
	    Thread.sleep(2000);
	    
	    System.out.println("After Logout");
	    System.out.println("currenturl"+ driver.getCurrentUrl());
	    System.out.println("title"+ driver.getTitle());
       }
	
	

}
