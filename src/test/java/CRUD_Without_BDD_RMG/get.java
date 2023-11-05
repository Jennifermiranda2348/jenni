package CRUD_Without_BDD_RMG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class get {
	@Test
	public void getProject()
	{
		Response req = RestAssured.get("http://rmgtestingserver:8084/projects");
		System.out.println(req.prettyPrint());
				
	}

}
