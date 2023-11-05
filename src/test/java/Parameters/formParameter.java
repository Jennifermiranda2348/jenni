package Parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class formParameter {
	@Test
	public void formPara()
	{
		baseURI = "https://reqres.in/";
		
		
		given()
		.formParam("name", "Jellena")
		.formParam("job", "QA4")
		.contentType(ContentType.JSON)
		
		.when()
		.post("/api/users")
		
		.then()
//		.assertThat()
//		.statusCode(201)
//		.contentType(ContentType.JSON)
		.log().all();
	}

}
