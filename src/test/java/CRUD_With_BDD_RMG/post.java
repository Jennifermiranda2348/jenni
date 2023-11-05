package CRUD_With_BDD_RMG;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Generic_Utility.Java_Utility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class post {
	
	@Test
	public void createProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Deamon");
		jobj.put("projectName", "D00112");
		jobj.put("status", "Created");
		jobj.put("teamSize",25 );
		
		
		//Step 1: Precondition
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		//Step 2: Action
		.when()
		.post("/addProject")
		
		//step 3: Validate
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();	
	}
	
	
	
	
	
	
	

}
