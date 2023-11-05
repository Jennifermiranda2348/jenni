package Practice;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoClassReqres;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Reqres_Get_RC {
	@Test
	public void rRChain()
	{
		baseURI = "https://reqres.in/";
		
		Response res = when().get("/api/users?page=2");
				
		String name = res.jsonPath().get("data[2].first_name");
		System.out.println(name);
			
		res.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
		
		given().pathParam("FName", name)
		.when().get("/api/users/{FName}")
		.then().log().all();
	}

}

	


