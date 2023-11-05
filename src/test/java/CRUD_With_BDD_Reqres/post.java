package CRUD_With_BDD_Reqres;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Generic_Utility.Java_Utility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class post {
	
	@Test
	public void create()
	{
		baseURI = "https://reqres.in/";
				
//		Java_Utility jlib = new Java_Utility();
//		int ran = jlib.getRandomNumber();
		
		JSONObject jobj = new JSONObject();
		jobj.put("name", "Jestin");
		jobj.put("job", "QA3");
				
		given()
		.body(jobj)
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
