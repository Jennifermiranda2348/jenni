package Validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class staticResponseValid {
	@Test()
	public void staticRespValid()
	{
		String expData = "TY_PROJ_1341";
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		Response res = when().get("/projects");
		
		String actData = res.jsonPath().get("[2].projectId");
		Assert.assertEquals(actData, expData);
		System.out.println("Data Verified");
		
		res.then().assertThat()
		.time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS)
		.log().all();
	}

}
