package Script;

import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class headerValidation {
	
	@Test
	public void validateHeaderResponse()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		String expected_statusLine = "HTTP/1.1 200 ";
		String expected_Vary = "Access-Control-Request-Headers";
		String expected_contentType = "application/json";
		String expected_Pragma = "no-cache";
		String expected_Connection = "keep-alive";
		
		Response res = when().get("/projects/TY_PROJ_2197");
		
		String statusLine = res.statusLine();
		System.out.println("This is status Line:"+ statusLine);
		Assert.assertEquals(statusLine, expected_statusLine);
		
		Headers headers = res.getHeaders();
		System.out.println(headers);
		
	}
	
	
	
	

}
