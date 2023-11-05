package SpecBuilder;

import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoClass;
import PojoToCreateJavaObject.PojoClassReqres;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
public class SpecBuilder_Rmg {
	@Test
	public void specBuildRMG()
	{
		PojoClass pc = new PojoClass("Jenni","TY_Engg12","Created",30);
		
		RequestSpecification req = new RequestSpecBuilder()
		.setBaseUri("http://rmgtestingserver:8084")
		.setContentType(ContentType.JSON).build();
		
		ResponseSpecification res = new ResponseSpecBuilder()
		.expectContentType(ContentType.JSON)
		.expectStatusCode(201).build();
		
		given().spec(req).body(pc)
		
		.when().post("/addProject")
		
		.then().spec(res).log().all();
	}
}
