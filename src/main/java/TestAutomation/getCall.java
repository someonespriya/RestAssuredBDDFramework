package TestAutomation;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

public class getCall {
	@Test
	public void getCallExample()
	{
		given()
		.log().all()
		.when()
		    .get("http://api.zippopotam.us/US/90210")
		.then()
	        .assertThat()
	        .statusCode(200)
	        .contentType("application/json")
	        .body("places[0].'place name'",equalTo("Beverly Hills"))
	        .log().all();
        

	}
	

}
