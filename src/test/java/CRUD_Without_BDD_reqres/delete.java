package CRUD_Without_BDD_reqres;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class delete {
	@Test
	public void delete()
	{
		Response res = RestAssured.delete("https://reqres.in/api/users/2");
		System.out.println(res.prettyPrint());
	}

}
