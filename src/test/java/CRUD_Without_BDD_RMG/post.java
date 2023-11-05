package CRUD_Without_BDD_RMG;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Generic_Utility.Java_Utility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post {
	@Test
	public void CreateProject()
	{
		Java_Utility jLib = new Java_Utility();
		JSONObject jObj = new JSONObject();
			jObj.put("createdBy", "Jennifer");
			jObj.put("projectName", "TY_API001"+jLib.getRandomNumber());
			jObj.put("status", "Created");
			jObj.put("teamSize", 10);
		
		
		RequestSpecification reqst = RestAssured.given();
		reqst.body(jObj);
		reqst.contentType(ContentType.JSON);
		
		Response resp = reqst.post("http://rmgtestingserver:8084/addProject");
		
		System.out.println(resp.asString());
		System.out.println(resp.prettyPeek());
		System.out.println(resp.prettyPrint());
		System.out.println(resp.getContentType());
	}
	
	
	
	
	
	
}
