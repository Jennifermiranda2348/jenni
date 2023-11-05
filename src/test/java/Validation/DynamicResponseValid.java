package Validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DynamicResponseValid {
	@Test
	public void dynamicRespValid()
	{
		String expData = "TY_PROJ_1533";
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		Response res = when().get("/projects");
		boolean flag = false;
		List<String> pIDs = res.jsonPath().get("projectId");
		
		for(String projectID:pIDs)
		{
			if(projectID.equalsIgnoreCase(expData))
			{
				flag = true;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("Data verified");
//		res.then().log().all();
	}

}
