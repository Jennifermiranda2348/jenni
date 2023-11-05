package PostData_Reqres;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoClass;
import PojoToCreateJavaObject.PojoClassReqres;
import io.restassured.http.ContentType;

public class pojo {
	
	@Test
	public void createUsingPojo()
	{
		baseURI = "https://reqres.in/";
		
		PojoClassReqres pc = new PojoClassReqres("Jennifer Miranda", "QA2");
		
		given()
		.body(pc)
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
