package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPageNOP;

public class StepDefPO {
	
	WebDriver driver;
	LoginPageNOP lp;
	    
    
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		
        driver = new ChromeDriver();
		lp = new LoginPageNOP(driver);
		
	    
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
	   
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String uname, String pass) throws Exception {
		
		
		lp.enter_user(uname);
		lp.enter_pass(pass);
		
		
	  
	}

	@When("Click on Login")
	public void click_on_Login() {
		
		lp.clickLoginButton();
		
	   
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String Expected) throws Exception {
		
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), Expected);
	    
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws Exception {
		
		driver.findElement(By.partialLinkText("Logo")).click();
		Thread.sleep(1000);
		
	   
	}

	@Then("close browser")
	public void close_browser() throws Exception {
	
		Thread.sleep(3000);
		driver.close();
		
	   
	}

}
