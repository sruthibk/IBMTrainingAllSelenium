package reqresExample;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

//import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import utility.ConstantsAPI;



public class TC_03_verifyUpdateUser {
	
	
	@Test
	public void verifyCreateUserTest() throws Exception {
		baseURI = ConstantsAPI.api_reqres_server;
		
//		String lastname = "Mallick";
//		String firstName = "Pooja";
		
		//creating a JSON request body/payload
		
		JSONObject request = new JSONObject();
		request.put("last_name", "Weaver");
		request.put("first_name", "Janet");
				
		System.out.println("======================================");
		System.out.println(request.toJSONString());
		System.out.println("======================================");
		
		
		given().
		
			//header
		
			header("Content-Type", "application/json").
			//paramter
			//auth
			//body
		
			//body(request.toJSONString()).
			
//			{
//			    "name": "komal",
//			    "job": "manager"
//			}
//		
		
		when().
			//action ----- sending a request to server ------ get/post/put/patch/delete etc......
		
			put("/users/2").
		
		
		
		then().
			
			//validation step
			//statusCode
			//value
			//header
			//value using JSON path
		
			//statusCode(200).
//			body("name", equalTo(ibm_name)).
//			body("job", equalTo(ibm_role)).
			
			log().all();
		
		
		Thread.sleep(3000);
	}
	
	
	
	
	


}
