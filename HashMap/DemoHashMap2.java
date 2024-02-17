package HashMap;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap2 {

	public static void main(String[] args) {
	HashMap<Integer, String> map=new HashMap<Integer, String>();
	map.put(101, "Amit");
	map.put(102, "Sumit");
	map.put(103, "Rushi");
	
	//second way to print HashMap using For-Each-Loop
	Set<Integer> s=map.keySet();
	for(int i:s) {
		System.out.println("Key>> "+i);
		System.out.println("Value>> "+map.get(i));
	}
 }

}
