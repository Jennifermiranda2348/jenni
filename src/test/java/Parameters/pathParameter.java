package Parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class pathParameter {
	@Test
	public void pathPara()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		given().pathParam("pid", "TY_PROJ_1419")
		
		.when().get("/projects/{pid}")
		
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
	}

}
