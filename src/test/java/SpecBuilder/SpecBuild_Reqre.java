package SpecBuilder;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoClassReqres;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuild_Reqre {
	@Test
	public void specBuildReqres()
	{
		PojoClassReqres pc = new PojoClassReqres("Jenni","TY_Engg");
		
		RequestSpecification req = new RequestSpecBuilder()
		.setBaseUri("https://reqres.in")
		.setContentType(ContentType.JSON).build();
		
		ResponseSpecification res = new ResponseSpecBuilder()
		.expectContentType(ContentType.JSON)
		.expectStatusCode(201).build();
		
		given().spec(req).body(pc)
		
		.when().post("/api/users")
		
		.then().spec(res).log().all();
	}

}
