package PostData_RMG;

import org.testng.annotations.Test;

import Generic_Utility.Java_Utility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class HashMap23 {
	
	@Test
	public void HashMap1()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		Java_Utility jlib = new Java_Utility();
		int ran = jlib.getRandomNumber();
		
		
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("createdBy","Nanu");
		map.put("projectName","ty_jv"+ran);
		map.put("status","On going");
		map.put("teamSize",20);
		
		given()
		.body(map)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}
	

}
