package api;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class Data {
	
	@Test 
	public void singleUserEmail() {
		given().
			get("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			body("data.email[0]", 
					equalTo("j"));
			
	}
}
