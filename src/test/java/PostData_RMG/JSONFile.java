package PostData_RMG;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class JSONFile {
	@Test
	public void JFile()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		File filePath = new File("./data.json");
		given()
		.body(filePath)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}

}
