package CRUD_Without_BDD_RMG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class delete {
	@Test
	public void deleteProject()
	{
		Response res = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_1432");
		System.out.println(res.prettyPrint());
	}
}
