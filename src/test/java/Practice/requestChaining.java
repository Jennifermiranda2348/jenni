package Practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoClass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class requestChaining {
	@Test()
	public void requestChain()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		PojoClass pc = new PojoClass("Mine","TY_RChain1","Created",20);
		
//		JSONObject jobj = new JSONObject();
//		jobj.put("createdBy", "Mine");
//		jobj.put("projectName", "TY_RChain");
//		jobj.put("status", "Created");
//		jobj.put("teamSize", 20);
		
		Response res = given().body(pc)
		.contentType(ContentType.JSON)
		.when().post("/addProject");
				
		String pid = res.jsonPath().get("projectId");
		System.out.println(pid);
		
		res.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
		given().pathParam("projID", pid)
		.when().get("/projects/{projID}")
		.then().log().all();
		
		
		
	}

}
