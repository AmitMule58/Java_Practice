package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//Program for demonstrate the arraylist method

public class Demo {
	public static void main(String[] args){
	ArrayList<Integer> list=new ArrayList<Integer>();{//created Arraylist object
	 list.add(1);
	 list.add(3);
	 list.add(2);
	 System.out.println("before sorting: "+list);
	 Collections.sort(list); //for sorting
	 System.out.println("After sorting: "+list);
	 
	 System.out.println(list.contains(2));//true because list contains value 2
	 System.out.println(list.size());// size of arraylist which is 3
	 System.out.println(list.get(1));// gives the value at position 1 which is 2 (after sorting)
	 System.out.println(list.indexOf(2));// will gives the index no. of given value
	 System.out.println(list.isEmpty());// false arraylist is not empty
 
	 Iterator<Integer> itr = list.iterator();//Iterator reff to list object
	while(itr.hasNext()) { //hasNext checks the next indexes have values or not
		System.out.println(itr.next());
	}
}
}
}
