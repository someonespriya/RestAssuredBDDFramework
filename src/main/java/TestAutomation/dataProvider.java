package TestAutomation;

import org.testng.annotations.DataProvider;

public class dataProvider {
	
	@DataProvider(name="zipCodeaAndPlaces")
	public static Object[][] zipCodeaAndPlaces()
	{
		return new Object[][]{
			
			{"us","90210","Beverly Hills"},
		    {"us","12345","Schnenecttady"},
			{"ca","B2R","Waverley"}
			
		
		
	};

}
}
