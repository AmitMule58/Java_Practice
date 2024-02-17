package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

//Program for copy one arraylist into another arraylist.
public class Demo1 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("This is ArrayList 1 "+al);//prints current al ArrayList
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(40);
		al1.add(50);
		al1.add(60);
		System.out.println("This is ArrayList 2 "+al1);//prints current al1 ArrayList
		System.out.println();

		al.addAll(al1);//it will add al1 lists all content to al
		
		//prints using Iterator
		Iterator<Integer> itr=al.iterator();//using iterator to iterate the arraylist
		while(itr.hasNext()) {// it will check next index have any value
			System.out.println(itr.next());

		}
	}

}
