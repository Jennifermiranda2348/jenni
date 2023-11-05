package CRUD_With_BDD_Reqres;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class get {
	@Test
	public void fetch()
	{
		baseURI = "https://reqres.in/";
		
		when()
		.get("/api/users/2")
		.then().log().all();
	}

}
