package cookies;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Map;

public class getAllCookies {
	@Test
	public void getAll()
	{
		Response resp = given()
		.when().get("https://reqres.in");
		
		//To capture all cookies info
		
		Map<String, String> allCookie = resp.getCookies();
		
		//To capture only key value
		System.out.println(allCookie.keySet());
		
		for(String cookieKey : allCookie.keySet())
		{
			String cookieValue = resp.getCookie(cookieKey);
			
			System.out.println(cookieKey+ "--->"+cookieValue);
		}
	}
	
	

}
