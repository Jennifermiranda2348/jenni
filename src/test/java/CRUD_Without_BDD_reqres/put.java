package CRUD_Without_BDD_reqres;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class put {
	@Test
	public void update()
	{
		JSONObject jObj = new JSONObject();
		jObj.put("name", "Jennifer Miranda");
		jObj.put("job", "Team Lead");
		
		RequestSpecification req = RestAssured.given();
		req.body(jObj);
		req.contentType(ContentType.JSON);
		
		Response res = req.put("https://reqres.in/api/users/");
		System.out.println(res.prettyPrint());
		System.out.println(res.contentType());
	}
}
