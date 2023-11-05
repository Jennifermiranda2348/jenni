package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoClass;
import PojoToCreateJavaObject.PojoClassReqres;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Reqres_DP {
	@DataProvider(name="multiData")
	public Object[][] data()
	{
		Object[][] d = new Object[4][2];
		
		d[0][0]="Jack";
		d[0][1]="QA1";
		
		d[1][0]="Jill";
		d[1][1]="QA2";
		
		d[2][0]="Jim";
		d[2][1]="QA3";
		
		d[3][0]="Jam";
		d[3][1]="QA4";
		return d;
	}
	
	@Test(dataProvider="multiData")
	public void addUser(String name,String job)
	{
		baseURI ="https://reqres.in";
		PojoClassReqres pc = new PojoClassReqres(name,job);
		
		given()
		.body(pc)
		.contentType(ContentType.JSON)
		
		.when().post("/api/users")
		
		.then().log().all();
	}
	

}
