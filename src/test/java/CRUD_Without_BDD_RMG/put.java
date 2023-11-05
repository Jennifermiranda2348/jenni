package CRUD_Without_BDD_RMG;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Generic_Utility.Java_Utility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class put {
	@Test
	public void updateProject()
	{
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "Jennifer Miranda");
		jObj.put("projectName", "TY_API00qs");
		jObj.put("status", "On going");
		jObj.put("teamSize", 15);
		
		RequestSpecification req = RestAssured.given();
		req.body(jObj);
		req.contentType(ContentType.JSON);
		
		Response res = req.put("http://rmgtestingserver:8084/projects/TY_PROJ_1432");
		
		System.out.println(res.prettyPrint());
	}
}
