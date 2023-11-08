package crossbrowsertest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPCommTest extends BaseTest{

	
	@Test

	public void verifySearchFeature() throws InterruptedException {

		

		

		System.out.println("verifySearchFeature executing test case");

		

		System.out.println("App URL: " + driver.getCurrentUrl());

		System.out.println("App Title: " + driver.getTitle());

		

		

		

		driver.findElement(By.xpath("//input[@name='Email']")).clear();

		

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("admin@yourstore.com");
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"validation fails");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Logo")).click();
		Thread.sleep(4000);
		Assert.assertTrue(driver.getTitle().contains("Login"),"validation fails");

		
		

		

		

	}



}

