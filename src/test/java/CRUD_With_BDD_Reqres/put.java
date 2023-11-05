package CRUD_With_BDD_Reqres;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class put {
	@Test
	public void update()
	{
		baseURI = "https://reqres.in/";
		
		JSONObject jobj = new JSONObject();
		jobj.put("name", "Jestin Miranda");
		jobj.put("job", "QA");
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		.when()
		.put("/api/users/532")
		
		.then()	
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
	}

}
