package cookies;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class validateCookie {
	
	@Test
	public void validateCookie()
	{
		given()
		.when().get("https://www.google.com")
		
		.then()
		.cookie("1P_JAR")
		.cookie("AEC")
		.cookie("NID").log().all();
	}

}
