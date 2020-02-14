package RestAssuredInBDD.RestAssuredInBDD;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class runTest extends ReadPropertiesFileTest{
	
  public static void databaseConnection(){
    
//	    String driver =properties.getProperty("db.driver");
//	    String dburl = properties.getProperty("db.url");
//	    String dbname = properties.getProperty("db.dbname");
//	    String dbquery = properties.getProperty("db.query");
//	    String dbuser = properties.getProperty("db.username");
//	    String dbpassword = properties.getProperty("db.password");
//	    
//	    System.out.println("driver: " +driver);
//	    System.out.println("dburl: " +dburl);
//	    System.out.println("dbname: " +dbname);
//	    System.out.println("dbquery: " +dbquery);
//	    System.out.println("dbuser: " +dbuser);
//	    System.out.println("dbpassword: " +dbpassword);
//	    
//	Class.forName(driver);
//    
//    // Create a connection to the MySQL database
//    Connection conn = DriverManager.getConnection(dburl + dbname, dbuser, dbpassword);
//         
//    // Create a statement to be executed
//    Statement stmt = conn.createStatement();
//         
//    // Execute the query
//    ResultSet rs = stmt.executeQuery(dbquery);
//         
//    // Loop through the query results and run the REST service test for every row
//    while (rs.next()) {
//        String zipcode = rs.getString("zipcode");
//        String city = rs.getString("city");
//        String state = rs.getString("state");
//        try {
//            testService(zipcode,city,state);
//        } catch (IOException e) {
//            System.out.println(e.toString());
//        }
//    }
//         
//    // Close the database connection
//    conn.close();
//         
//} catch (ClassNotFoundException  e2) {
//    System.out.println(e2.toString());
//}       
}
}

