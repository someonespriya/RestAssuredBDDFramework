package RestAssuredInBDD.RestAssuredInBDD;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

	public static String getStringName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("JohnJohn" + generatedString);
	}

	public static String getStringJob() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Tester" + generatedString);
	}

	public static String getIntID() {

		String generatedID = RandomStringUtils.randomAlphabetic(1);
		return (1 + generatedID);
	}

	public static String getStringemail() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("lilipriya0908@gmail.com" + generatedString);
	}

	public static String getStringfirst_name() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Eve" + generatedString);
	}

	public static String getStringlast_name() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Holt" + generatedString);
	}

	public static String getStringavatar() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("https://s3.amazonaws.com/uifaces/faces/twitter/follettkyle/128.jpg" + generatedString);
	}

}
