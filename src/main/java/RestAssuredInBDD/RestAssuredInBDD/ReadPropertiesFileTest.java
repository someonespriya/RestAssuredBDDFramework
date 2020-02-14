package RestAssuredInBDD.RestAssuredInBDD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileTest {
	public static void main(String args[]) throws IOException  {
		
		FileInputStream fis=null;
		Properties properties = null;
		try {
			fis=new FileInputStream("C:\\Users\\priya.kumari\\workspace\\RestAssuredInBDD\\src\\main\\java\\RestAssuredInBDD\\RestAssuredInBDD\\dbdriven.properties");
			properties = new Properties();
			properties.load(fis);
		} catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch (Exception e1) {
			
			e1.printStackTrace();
		}finally{
			fis.close();
		}
		
  }
	}