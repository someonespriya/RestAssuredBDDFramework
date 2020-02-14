package RestAssuredInBDD.RestAssuredInBDD;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class get_restAssuredTests {
	@Test
	public void getEmployeeDetails() { {
		/*
		 * given() .when() .get("https://reqres.in/api/users?page=2") .then()
		 * .statusCode(200) .statusLine("HTTP/1.1 200 OK")
		 * .assertThat().body("page",equalTo(2))
		 * .header("Content-Type","application/json; charset=utf-8"); }
		 */

		/*given().
		when().
		  get("http://ergast.com/api/f1/2017/circuits.json").
		then().
		  assertThat().
		  statusCode(200).
		and().
		  contentType(ContentType.JSON).
		and().
		header("Content-Length", equalTo("4552"));

	}
	
*/
given().
		    when().
		        get("http://ergast.com/api/f1/2017/circuits.json").
		    then().
		        assertThat().
		        body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
		}
	}
}


