package authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class baerer_Token {
@Test
	public void b_token()
	{
	baseURI ="https://api.github.com";
		
	JSONObject jobj = new JSONObject();
	jobj.put("name","jenni");
	
	
	given().auth().oauth2("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")
	.body(jobj)
	.contentType(ContentType.JSON)
	
	
	.when().post("/user/repos")
	
	.then().assertThat().log().all();
	
	
	
	}
}
