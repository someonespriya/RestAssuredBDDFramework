package RestAssuredInBDD.RestAssuredInBDD;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class put_UpdateRequest {
	
	public static HashMap map=new HashMap();
	
	String empfirst_name=RestUtils.getStringfirst_name();
	String emplast_name=RestUtils.getStringlast_name();
	
	int id=4;

	@BeforeClass
	public void putData()
	{
		map.put("first_name", empfirst_name);
		map.put("last_name", emplast_name);
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.basePath="/update"+id;
	}
	
	@Test
	public void testPut()
	{
		given()
	       .contentType("application/json")
		   .body(map)
		  
		.when()
		    .put()
		    
		.then()
		    .statusCode(200)
		.log().all();
		
	}

	
}
