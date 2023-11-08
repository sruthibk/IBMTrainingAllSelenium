package dropdownexample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HandleDropdown2 extends BaseTest{
	
	@Test

    public void listExample2() throws Exception {

        

        WebElement carlist = driver.findElement(By.xpath("//select[@id='Carlist']"));

        

        

        

        //create an object

        

        Select li = new Select(carlist);

        

        System.out.println("is dropdown accept multiple selection or not: " + li.isMultiple());             //false

        

        

        

        //indexing start from 0

        li.selectByIndex(1);                //BMW

        

        

        Thread.sleep(2000);

        

        li.selectByValue("Audi Car");       //Audi

        

        Thread.sleep(2000);

        

        li.selectByVisibleText("Toyota");   //Toyota

        

        

        Thread.sleep(5000);

        

        

    }



}




