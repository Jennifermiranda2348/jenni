package authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2_GenerateTokenUsingCOOP {
@Test
public void generateToken()
{
	Response res = given()
	.formParam("client_id","TestingSkill")
	.formParam("client_secret","5343c4186fd09764dab1c4fa41cd6c99")
	.formParam("grant_type","client_credentials")
	.formParam("redirect_uri","http://mychoice.com")
	.formParam("code","authorization_code")
	
	.when().post("http://coop.apps.symfonycasts.com/token");
	
	String token = res.jsonPath().get("access_token");
	
	given().auth().oauth2(token).pathParam("id", 4738)
	.when().post("http://coop.apps.symfonycasts.com/api/{id}/eggs-count")
	.then().log().all();
}
}
