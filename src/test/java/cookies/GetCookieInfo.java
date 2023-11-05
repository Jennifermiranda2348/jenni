package cookies;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetCookieInfo {
	
	@Test
	public void passCookiesInfo()
	{
		Response resp = given()
		.when().get("https://www.google.com");
		
		// To get single cookie info
		
		String value = resp.getCookie("AEC");
		System.out.println("The value of AEC is :" +value);
				
	}

}
