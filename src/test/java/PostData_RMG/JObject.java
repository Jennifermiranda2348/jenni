package PostData_RMG;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Generic_Utility.Java_Utility;
import io.restassured.http.ContentType;

public class JObject {
	
	@Test
	public void createProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		Java_Utility jlib = new Java_Utility();
		int ran = jlib.getRandomNumber();
		
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Deamon");
		jobj.put("projectName", "D0011"+ran);
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
