package Practice;

import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoClassReqres;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class reqres_RChain {
	
	@Test
	public void rRChain()
	{
		baseURI = "https://reqres.in/";
		
		PojoClassReqres pc = new PojoClassReqres("Yarunenu","QA2");
		
		Response res = given()
		.body(pc).contentType(ContentType.JSON)
		.when().post("/api/users");
				
		String name = res.jsonPath().get("name");
		System.out.println(name);
			
		res.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
		given().pathParam("FName", name)
		.when().get("/api/users/{FName}")
		.then().log().all();
	}

}
