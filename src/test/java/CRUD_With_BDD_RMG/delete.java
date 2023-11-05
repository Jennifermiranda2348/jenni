package CRUD_With_BDD_RMG;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class delete {
	@Test
	public void deleteProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		when()
		.delete("/projects/TY_PROJ_1446")
		
		.then()
		.assertThat()
		.statusCode(204)
		.log().all();
	}

}
