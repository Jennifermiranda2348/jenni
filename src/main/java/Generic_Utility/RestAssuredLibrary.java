package Generic_Utility;

import io.restassured.response.Response;

public class RestAssuredLibrary {
	/*
	 * This method will return json data from the corresponding response body
	 */
	public String getJsonData(Response res,String path)
	{
		String jsonData = res.jsonPath().get(path);
		return jsonData;
	}
}
