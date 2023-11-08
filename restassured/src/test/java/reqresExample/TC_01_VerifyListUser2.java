package reqresExample;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import utility.ConstantsAPI;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;
public class TC_01_VerifyListUser2 {
@Test
	public void VerifyListUserTest() {
		// TODO Auto-generated constructor stub
	baseURI = ConstantsAPI.api_reqres_server;
	
	
	given().
		
	when().
	
	 get("/api/users?page=2").
	 then().

     assertThat().

     statusCode(200).

 and().

     contentType(ContentType.JSON);

	}

}
