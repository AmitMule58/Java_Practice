package ArrayList;

import java.util.ArrayList;

//Program for designing generic ArrayList for Integer type only
public class Demo2 {
	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	
	//print using for each loop
	for(int i:al) { //for each loop
		System.out.println(i);
	}
	
	}

}
