package RestAssuredInBDD.RestAssuredInBDD;

import java.util.HashMap;

import org.hamcrest.Matcher;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class post_CreateEmployee {
	
	public static HashMap map=new HashMap();
	
	@BeforeClass
	public void postData()
	{
		map.put("name", RestUtils.getStringName());
		map.put("job", RestUtils.getStringJob());
		
		 RestAssured.baseURI="https://reqres.in/";
		 RestAssured.basePath="api/users";
	}
	
	@Test
	public void testData()
	{
		given()
		   .contentType("application/json")
		   .body(map)
		    
		.when()
		   .post()
		   
		.then()
		    .statusCode(201)
		    .body("SuccessCode", equalTo("OPERATION_SUCCESS"));
	}
}
