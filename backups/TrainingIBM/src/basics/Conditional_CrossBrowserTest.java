package basics;

public class Conditional_CrossBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String browser="chrome";
String browser=Constants.browserdetails;
		if (browser.equalsIgnoreCase("CHROME")) {
			System.out.println("execute testcase on chrome browser");
		}
		else if(browser.equalsIgnoreCase("EDGE")){
			System.out.println("edge");
			
		}
		else {
			System.out.println("execute testcase on default browser");
		}

	}

}
