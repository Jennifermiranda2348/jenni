package Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class Reqres_Static {
	@Test
	public void stat()
	{
		String expData = "Byron";
		baseURI = "https://reqres.in/";
		
		Response res = when().get("/api/users?page=2");
		String actData = res.jsonPath().get("data[3].first_name");
		Assert.assertEquals(actData,expData);
		System.out.println("Data Verified");
	}

}
