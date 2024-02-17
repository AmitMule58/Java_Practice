package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//Program for sorting arraylist

public class Demo4 {
	public static void main(String[] args) {
ArrayList<String> al=new ArrayList<String>();
al.add("Amit");
al.add("Rushi");
al.add("Shruti");
al.add("Abhi");
al.add("Pramila");
al.add("Shweta");
al.add("Mikhail");
al.add("Vishal");

Collections.sort(al);
System.out.println(al);


}
}