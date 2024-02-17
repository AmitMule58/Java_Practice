package ArrayList;

import java.util.ArrayList;

//Program for merging two arraylist into one arraylist

public class Demo5 {

	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(100);
	al.add(200);
	al.add(300);
	System.out.println("First Arralist "+al);
	
	ArrayList<Integer> al1=new ArrayList<Integer>();
	al1.add(400);
	al1.add(500);
	al1.add(600);
	System.out.println("Second Arraylist "+al1);
	
	ArrayList<Integer> al2=new ArrayList<Integer>();
	al2.addAll(al);// add all elements from al to al2
	al2.addAll(al1);// add all elements from al1 to al2
	System.out.println("Merge Arraylist "+al2); // prints combination of al & al1
	
	}

}
