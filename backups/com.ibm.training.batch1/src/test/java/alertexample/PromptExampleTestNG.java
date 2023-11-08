package alertexample;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PromptExampleTestNG extends BaseTest {
	@Test
	public void promptExample() throws Exception {
		
		
		WebElement btn_PromptAlert = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));

        btn_PromptAlert.click();
        
        
        Thread.sleep(4000);
        //driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("values to send");
        Alert simpleAlert = driver.switchTo().alert();
        
        System.out.println(simpleAlert.getText());
        
        Assert.assertEquals(simpleAlert.getText(), "Your Name Please");
        assertTrue(simpleAlert.getText().contains("Your Name Please"));
       
        simpleAlert.sendKeys("sruthi");
        Thread.sleep(4000);
        simpleAlert.accept();
        
        
        
        
	}

}
