package Validation;

import static io.restassured.RestAssured.baseURI;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Reqres_dynamic {
	@Test
	public void dyna()
	{
		String expData = "Rachel";
		baseURI = "https://reqres.in/";
		
		Response res = when().get("/api/users?page=2");
		boolean flag = false;
		List<String> fName = res.jsonPath().get("data.first_name");
		
		for(String firstName:fName)
		{
			if(firstName.equalsIgnoreCase(expData))
			{
				flag = true;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("Data Verified");
	}

}
