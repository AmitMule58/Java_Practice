package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DemoHashMap3 {

	public static void main(String[] args) {
	HashMap<Integer, String> map=new HashMap<Integer, String>();
	map.put(101, "Amit");
	map.put(102, "Sumit");
	map.put(103, "Rushi");
	
	// Third way to print HashMap using Iterator
	Set<Integer> s = map.keySet();
	Iterator<Integer> itr = s.iterator();
	while(itr.hasNext()) {
		Integer i = itr.next();
		System.out.println("Key>> "+i);
		System.out.println(""+map.get(i));
	}
		
	}

}
