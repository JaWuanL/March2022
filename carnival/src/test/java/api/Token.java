package api;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Request;

public class Token {
	
	@Test
	public void verifyTokenValue() {
		
		//Map<String, Object> map = new HashMap<String, Object>();
		
		//map.put("email", "eve.holt@reqres.in");
		//map.put("password", "cityslicka");
		
		//System.out.println(map);
		
		JSONObject request = new JSONObject();
		
		request.put("email", "eve.holt@reqres.in");
		request.put("password", "cityslicka");
		
		System.out.println(request);
		


		given().
			body(request.toJSONString).
		when().
			post("https://reqres.in/api/register").
		then().
			statusCode(201);
	}

}
