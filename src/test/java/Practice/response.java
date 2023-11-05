package Practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class response {
	@Test
	public void responseMethods()
	{
		JSONObject jobj = new JSONObject(); 
		jobj.put("name", "Jestin");
		jobj.put("job", "Test Lead");
			
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");

//		System.out.println(res.getContentType());
//		System.out.println(res.getTime());
//		System.out.println(res.getTimeIn());
//		System.out.println(res.getSessionId());
//		System.out.println(res.getCookies());
//		System.out.println(res.getBody());
		System.out.println(res.getStatusLine());
		
	}
	

}
