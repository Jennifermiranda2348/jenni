package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class queryParameter {
@Test
public void queryPara()
{
	baseURI = "https://reqres.in/";
	
	
	given()
	.queryParam("page", 2)
	.queryParam("page", 1)
	
	.when().get("/api/users")
	
	.then()
	.assertThat()
	.statusCode(200)
	.contentType(ContentType.JSON)
	.log().all();
}
}
