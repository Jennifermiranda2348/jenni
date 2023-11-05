package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoClass;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class dataProvider {
	@DataProvider(name = "getData")
	public Object[][] data() {
		Object[][] data = new Object[3][4];

		data[0][0] = "Jenni";
		data[0][1] = "Conquister";
		data[0][2] = "Created";
		data[0][3] = 15;

		data[1][0] = "Shridhar";
		data[1][1] = "Accenture";
		data[1][2] = "On Going";
		data[1][3] = 25;

		data[2][0] = "Calvin";
		data[2][1] = "Monster";
		data[2][2] = "Completed";
		data[2][3] = 35;
		return data;
	}

	@Test(dataProvider = "getData")
	public void AddProjectDP(String createdBy, String projectName, String status, int teamSize) {
		
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		PojoClass pc = new PojoClass(createdBy, projectName, status, teamSize);

		given().body(pc).contentType(ContentType.JSON).when().post("/addProject").then().log().all();
	}

}
