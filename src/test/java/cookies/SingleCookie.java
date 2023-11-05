package cookies;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class SingleCookie {
	
	@Test
	public void singleCookie1()
	{
		given()
		.cookies("1P_JAR","2023-11-02-11",
				"AEC","Ackid1TcP-163KR-NKJkpV6JFTOnrpXA6TaLLv5iSRwO8JGLXm8kj1g-bjc",
				"NID","511=u-szlU9RRlnFjbPb15wqrenNnZdhKj_tpkz01yi6EcTME9vyRVNHGGUX914NFQgnKU2Ilg6OWX7bIF7gXIY9P1f-fxxkEO2XOEaLmRMedz1X_P6aay03Kpizb6tGfBRM_XCtHll0-iUsmFRFPsIVbHyyxfayKbCchFV_d9C7Wko")
		
		.when().get("https://www.google.com")
		
		.then().log().all();
	}

}
