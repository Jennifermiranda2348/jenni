package CRUD_With_BDD_RMG;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class get {
	@Test
	public void getProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		when()
		.get("/projects")
		.then().log().all();
		
	}
}
