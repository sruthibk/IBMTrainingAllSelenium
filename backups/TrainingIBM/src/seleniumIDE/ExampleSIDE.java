package seleniumIDE;



//ctrl+shift+O ----- add or remove unused imports



//Generated by Selenium IDE

import org.junit.Test;

import org.junit.Before;

import org.junit.After;

import org.junit.Assert;



import static org.junit.Assert.*;

//import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Alert;

import org.openqa.selenium.Keys;

import java.util.*;

import java.net.MalformedURLException;

import java.net.URL;

public class ExampleSIDE {

private WebDriver driver;

private Map<String, Object> vars;

JavascriptExecutor js;

@Before

public void setUp() {

 driver = new ChromeDriver();

 //js = (JavascriptExecutor) driver;

 //vars = new HashMap<String, Object>();

}

@After

public void tearDown() {

// driver.quit(); 
	driver.close();

}

@Test

public void recaptest() {

 driver.get("https://www.amazon.in/");

 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro");

 driver.findElement(By.id("nav-search-submit-button")).click();

 

 

 System.out.println("Actual Application Title: " + driver.getTitle());

 

 Assert.assertEquals("Amazon.in : iphone 15 pro", driver.getTitle());

 //assertThat(driver.getTitle(), is("Amazon.in : iphone 14 pro"));

 

 

 

}

}