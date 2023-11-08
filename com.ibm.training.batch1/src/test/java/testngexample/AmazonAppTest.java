package testngexample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonAppTest {
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launch an app");
		
	}
	
	
	@AfterTest
	
	public void closeApp() {
		
		System.out.println("close an app");
		
	}
	
	@Test(priority=-100)
	
	public void test1() {
		System.out.println("test1");
	}
	
@Test(priority=2)
	
	public void test2() {
		System.out.println("test2");
	}

@Test

public void test3() {
	System.out.println("test3");
}

@Test(priority=1)

public void test4() {
	System.out.println("test4");
}

	
	
	

}
