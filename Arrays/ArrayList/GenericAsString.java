package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

//Program for designing the generic ArrayList for String type only

public class GenericAsString {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Delhi");
		
		System.out.println(al); //1st way to print
		
		Iterator<String> itr=al.iterator();// 2nd way to print by using iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		for(String str:al) { // 3rd way to print by using for each loop
			System.out.println(str);
		}
	}
  }
}
