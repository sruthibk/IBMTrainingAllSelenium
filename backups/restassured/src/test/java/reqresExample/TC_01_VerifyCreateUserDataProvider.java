package reqresExample;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import utility.ConstantsAPI;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;
public class TC_01_VerifyCreateUserDataProvider {
@Test(dataProvider="smoketestdata")

	public void VerifyCreateUserTest(String ibm_name,String ibm_role) {
		// TODO Auto-generated constructor stub
	baseURI = ConstantsAPI.api_reqres_server;
	
	
	JSONObject request = new JSONObject();
	request.put("name", ibm_name);
	request.put("job", ibm_role);
	
	System.out.println("===============");
	System.out.println(request.toJSONString());
	System.out.println("------------");
	given().
		header("Content-Type","application/json").
		body(request.toJSONString()).
	when().
	
	 post("/api/users").
	 then().
	 assertThat().
      statusCode(201).
      body("name", equalTo(ibm_name)).
      body("job", equalTo(ibm_role));

	}

@DataProvider
public Object[][] smoketestdata(){
	Object[][] data= {{"sanam","sr.Leader"},{"siraj","Manager"}};
	return data;
}

}