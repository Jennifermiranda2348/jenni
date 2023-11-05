package CRUD_With_BDD_Reqres;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class patch {
	@Test
	public void partialUpdate()
	{
		baseURI = "https://reqres.in/";
		
		JSONObject jobj = new JSONObject();
		jobj.put("name", "Jestin Miranda");
		jobj.put("job", "QA2");
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		.when()
		.patch("/api/users/532")
		
		.then()	
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
	}

}
