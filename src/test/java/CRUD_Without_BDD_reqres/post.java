package CRUD_Without_BDD_reqres;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Generic_Utility.Java_Utility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post {
	@Test
	public void create()
	{
		JSONObject jobj = new JSONObject(); 
		jobj.put("name", "Jestin");
		jobj.put("job", "Test Lead");
			
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		
		Response res = req.post("https://reqres.in/api/users");
		
		//System.out.println(res.asString());
	System.out.println(res.prettyPeek());
//		System.out.println(res.prettyPrint());
//		System.out.println(res.getContentType());
		
		
	}

}
