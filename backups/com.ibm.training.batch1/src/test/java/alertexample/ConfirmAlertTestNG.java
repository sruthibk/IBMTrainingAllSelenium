package alertexample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfirmAlertTestNG extends BaseTest {
	
	@Test

    public void ConfirmAlert() throws Exception {

        

        System.out.println("testng execution ");

        

        //click on btn_ShowmeAlert button

        

        WebElement btn_confirmAlert = driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));

        btn_confirmAlert.click();

        

        

        Thread.sleep(4000);

        

        //handle an Alert

        //Alert/window/frame   ------- driver.switchTo()

        

        

        Alert confirmAlert = driver.switchTo().alert();

        

        

        //validation step

        //alert text

        

        

        System.out.println("Alert Text: " + confirmAlert.getText());

        

        

        Assert.assertEquals(confirmAlert.getText(), "Press 'OK' or 'Cancel' button!");

        

        Assert.assertTrue(confirmAlert.getText().contains("'OK' or 'Cancel'"));

        

        

        //on alert

        

//      getText

//      accept    ------ click on OK button

//      dismiss

//      sendkeys

        

        

        //confirmAlert.accept();

        

        confirmAlert.dismiss();

        

        WebElement ok_Cancel_verification = driver.findElement(By.xpath("//div[contains(@id,'demo')]"));

        

        System.out.println("*****************: " + ok_Cancel_verification.getText());

        

        

        Assert.assertTrue(ok_Cancel_verification.getText().contains("ok"), "error message: validation get failed !!");

        

        

        

    }

}
