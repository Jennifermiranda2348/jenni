package CRUD_Without_BDD_reqres;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class get {
	@Test
	public void getAllUser()
	{
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.prettyPrint());
	}
	
	@Test
	public void getUser()
	{
		Response res = RestAssured.get("https://reqres.in/api/users/10");
		System.out.println(res.prettyPrint());
	}
	
}
