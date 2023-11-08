package ddtExample;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utility.Constants;



public class BaseTest {

	

	

WebDriver driver;

	
@Parameters({"browser"})


@BeforeTest
	public void launchapp(String browsern) {

		System.out.println("===============launch application===============");

		

		//String browser = "edge";

		

		if (browsern.equalsIgnoreCase("CHROME")) {



			System.out.println("executing test on chrome browser");

			driver = new ChromeDriver();



		}



		else if (browsern.equalsIgnoreCase("edge")) {



			System.out.println("executing test on edge browser");

			driver = new EdgeDriver();

		}



		else if (browsern.equalsIgnoreCase("firefox")) {



			System.out.println("executing test on firefox browser");

			driver = new FirefoxDriver();

		}

	

//		driver = new EdgeDriver();

//		

		
		driver.get(Constants.nop_app);

		driver.manage().window().maximize();		

	}

	
@AfterTest
	public void closeApp() throws Exception {

		System.out.println("===============close application===============");

		Thread.sleep(7000);

		driver.close();

	}



}