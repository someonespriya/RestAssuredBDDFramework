package RestAssuredInBDD.RestAssuredInBDD;


	// Java program for write JSON to a file 

	import java.io.FileNotFoundException; 
	import java.io.PrintWriter; 
	import java.util.LinkedHashMap; 
	import java.util.Map; 
	import org.json.simple.JSONArray; 
	import org.json.simple.JSONObject; 

	public class jsonObject 
	{ 
		public static void main(String[] args) throws FileNotFoundException 
		{ 
			// creating JSONObject 
			JSONObject jo = new JSONObject(); 
			
			// putting data to JSONObject 
			jo.put("firstName", "John"); 
			jo.put("lastName", "Smith"); 
			jo.put("age", 25); 
			 //System.out.println(jo);
			// for address data, first create LinkedHashMap 
			Map m = new LinkedHashMap(6); 
			m.put("streetAddress", "21 2nd Street"); 
			m.put("city", "New York"); 
			m.put("state", "NY"); 
			m.put("postalCode", 10021);
			m.put("language","English");
			m.put("religion", "christian");
			
			// putting address to JSONObject 
			jo.put("address", m); 
			//System.out.println(m);
			
			// for phone numbers, first create JSONArray 
			JSONArray ja = new JSONArray(); 
			
			m = new LinkedHashMap(2); 
			m.put("type", "home"); 
			m.put("number", "212 555-1234"); 
	//System.out.println(m);
			// adding map to list 
			ja.add(m); 
			
			m = new LinkedHashMap(2); 
			m.put("type", "fax"); 
			m.put("number", "212 555-1234");
			ja.add(m);
			
			m = new LinkedHashMap(2);
			m.put("type", "office");
			m.put("number", "+91-8793007585");
			
			// adding map to list 
			ja.add(m); 
			
			// putting phoneNumbers to JSONObject 
			jo.put("phoneNumbers", ja); 
			
			System.out.println(jo);
			// writing JSON to file:"JSONExample.json" in cwd 
			PrintWriter pw = new PrintWriter("JSONExample1.json"); 
			pw.write(jo.toJSONString()); 
			pw.flush(); 
			pw.close(); 
		} 
	} 



