package HashMap;

import java.util.HashMap;

public class DemoHashMap4 {

	public static void main(String[] args) {
	HashMap<String, String> map=new HashMap<String, String>();
	map.put("Amit", "Mule");
	map.put("Sumit", "Mule");
	map.put("Rushi", "Mule");
	
	// forth way to print HashMap using For-Each Method (Lambda Expression ->)
	map.forEach((k,v)-> System.out.println("Key= "+k+", Value= "+v));

	}

}
