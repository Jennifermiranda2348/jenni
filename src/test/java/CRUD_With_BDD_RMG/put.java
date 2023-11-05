package CRUD_With_BDD_RMG;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Generic_Utility.Java_Utility;
import io.restassured.http.ContentType;

public class put {
	@Test
	public void updateProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		Java_Utility jlib = new Java_Utility();
		int ran = jlib.getRandomNumber();
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Jenni");
		jobj.put("projectName", "ty_api"+ran);
		jobj.put("status", "Completed");
		jobj.put("teamSize", 50);
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		.when()
		.put("/projects/TY_PROJ_1446")
		
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
		
	}

}
