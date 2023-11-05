package PostData_RMG;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoClass;
import io.restassured.http.ContentType;

public class pojo {
	
	@Test
	public void createUsingPojo()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		PojoClass pc = new PojoClass("Jennifer Miranda", "ty_api123", "Created", 15);
		
		given()
		.body(pc)
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
