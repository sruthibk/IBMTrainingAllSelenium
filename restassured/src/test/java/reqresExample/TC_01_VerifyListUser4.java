package reqresExample;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import utility.ConstantsAPI;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;
public class TC_01_VerifyListUser4 {
@Test
	public void VerifyListUserTest() {
		// TODO Auto-generated constructor stub
	baseURI = ConstantsAPI.api_reqres_server;
	
	
	given().
		param("q", "delhi");
	when().
	
	 get("/data/2.5/weather").
	 then().

     statusCode(200);
     //body("data[0].email", equalTo("michael.lawson@reqres.in"));

	}

}
