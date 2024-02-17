package HashMap;

import java.util.HashMap;
import java.util.Map;

// How to return map to method
public class MapDemo {
	
	// Design the getEmployee method which has return type as HashMap
	public HashMap<Integer, String> getEmployee(){
		HashMap<Integer, String> map =new HashMap<Integer, String>();  //Creating the object
		map.put(10, "Amit"); // Inserting the entries
		map.put(20, "Suraj");
		map.put(30, "Rushi");
		return map;	
	}
	
	public static void main(String[] args) {
	MapDemo demo=new MapDemo(); // Created the object of CLASS
	
	//First way to print
	System.out.println("First Way>> "+demo.getEmployee());
		
	//Second way to print
	HashMap<Integer, String> hashmap = demo.getEmployee();
	System.out.println("Second way>> "+hashmap);
	
	// Third way to print
	Map<Integer, String> map = demo.getEmployee();
	System.out.println("Third way>> "+map);
	}

}
