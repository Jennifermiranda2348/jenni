package CRUD_With_BDD_Reqres;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class delete {
	@Test
	public void delete()
	{
		baseURI = "https://reqres.in/";
		
		when()
		.delete("/api/users/405")
		
		.then()
		.assertThat()
		.statusCode(204)
		.log().all();
	}

}
