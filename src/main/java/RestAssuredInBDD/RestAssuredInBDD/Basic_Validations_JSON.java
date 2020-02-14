package RestAssuredInBDD.RestAssuredInBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Basic_Validations_JSON {
	//Test Status Code
	@Test(priority=1)
	public void testStatusCode()
	{
		
		
		when()
		.get("https://jsonplaceholder.typicode.com/posts/5")
		
		.then()
		.statusCode(200)
		.log().all();
		
	}
	
	//Log Response
	@Test(priority=2)
	public void testLogging()
	{
		given()
		
		.when()
		   .get("https://jsonplaceholder.typicode.com/posts/6")
		   
		.then()
		.statusCode(200)
		.log().all();
	}
	
	//Verifying single content in response body
	
	@Test(priority=3)
	public void testingSingleContent()
	{

		given()
		
		.when()
		   .get("https://reqres.in/api/users")
		   
		.then()
		   .statusCode(200)
		   .log().all()
		   .body("data[0].id", equalTo(1));
	}
	
	//Testing Multiple Contents(pending)
	
	@Test(priority=4)
	public void testingMultipleContent()
	{
		
		given()
		
		.when()
		   .get("htts://reqres.in/api/users")
		   
		.then()
		   .statusCode(200)
		   .log().all()
		   .body("data[2].avatar", equalTo("http://s3.amazonaws.com/uifaces/faces/twitter/olegpogodaev/128.jpg"));
		
	}
	
	//Setting parameters & headers
	@Test(priority=5)
	public void testParametersAndHeaders()
	{
		given()
		  .param("MyName", "priya")
		  .header("MyHeader","Indian")
		
		.when()
		   .get("http://reqres.in/api/users")
		   
		.then()
		  .statusCode(200)
		  .log().all();
		
		
	}

}
