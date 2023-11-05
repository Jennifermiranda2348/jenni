package PostData_Reqres;

import org.testng.annotations.Test;

import Generic_Utility.Java_Utility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class HashMap23 {
	
	@Test
	public void HashMap1()
	{
		baseURI = "https://reqres.in/";
		
		Java_Utility jlib = new Java_Utility();
		int ran = jlib.getRandomNumber();
		
		
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("name","Neenu");
		map.put("job","ty_jv"+ran);
		
		
		given()
		.body(map)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/api/users")
		
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}
	

}
