package HashMap;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Pune");
		hm.put(2, "Mumbai");
		hm.put(3, "Delhi");
		hm.put(4, "Chennai");
		hm.put(5, "Gurugram");
		
		//first way to print HashMap using print Statement
		System.out.println(hm);
		
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("Pune"));
		System.out.println(hm.get(3));
		System.out.println(hm.remove(1));
		System.out.println(hm.replace(4, "Hydrabad"));
		System.out.println(hm);
		System.out.println(hm.remove(5,"Noida"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
	
	}

}
