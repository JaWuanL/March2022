package api;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class UpdatedName {
	
	@Test
	public void updatedName() {
		
	
		JSONObject request = new JSONObject();

			
		request.put("name", "morpheus");
		request.put("job", "zion resident");
			
		System.out.println(request);
		System.out.println(request.toJSONString());
			
		given().
			body(request.toJSONString).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200);	

	}
}
