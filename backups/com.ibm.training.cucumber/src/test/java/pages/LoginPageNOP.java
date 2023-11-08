package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageNOP {

	
	WebDriver driver;
	public LoginPageNOP(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
    	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.NAME,using="Email")
	WebElement txt_user;
	@FindBy(how=How.NAME,using="Password")
	WebElement txt_pass;
	@FindBy(how = How.TAG_NAME, using = "button")
	WebElement submit_btn;
	
	
	public void enter_user(String user) throws Exception {
    	Thread.sleep(3000);
        txt_user.clear();
        txt_user.sendKeys(user);

        

    }
	
	public void enter_pass(String pwd) {
        txt_pass.clear();
        txt_pass.sendKeys(pwd);

        

    }
	
	public void clickLoginButton() {

		submit_btn.click();

        

    }
	
}
