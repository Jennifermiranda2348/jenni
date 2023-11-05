package Script;

import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.EndPointsLibrary;
import Generic_Utility.Java_Utility;
import PojoToCreateJavaObject.PojoClass;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class CreateCaptureValidateProject extends BaseClass {
	
	
		
	@Test
	public void createProject() throws Throwable
	

	{
		//Step 1: Create pre-requisites
		Java_Utility jLib = new Java_Utility();
		
		PojoClass pc = new PojoClass("SJ Miranda","TY_SJM112"+jLib.getRandomNumber(),"Completed",25);
		
		// Step 2: Send the request
		
		Response resp = given().spec(reqst).body(pc)
				
		.when().post(EndPointsLibrary.createProject);
		
		// Step 3: Capture the project ID
		
		String expData = rLib.getJsonData(resp, "projectId");
		System.out.println(expData);
		
		//Step 4: Validate the Id in database
		
		String query = "select * from project;";
		String actData = dLib.readDataFromDBAndValidate(query, 1, expData);
		Assert.assertEquals(actData,expData);
		System.out.println("TC Pass");
//		
		resp.then().log().all();
//		
		
	}
	
	

}
