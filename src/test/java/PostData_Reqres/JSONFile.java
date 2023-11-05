package PostData_Reqres;

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
		baseURI = "https://reqres.in/";
		
		File filePath = new File("./JData1.json");
		given()
		.body(filePath)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/api/users")
		
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}

}
