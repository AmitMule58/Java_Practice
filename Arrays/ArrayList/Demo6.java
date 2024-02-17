package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

//create the user arraylist defined type(datatype) for employee

public class Demo6 {

	public static void main(String[] args) {
	ArrayList<Employees> al=new ArrayList<Employees>();
	
	//by creating object of class Employees
	Employees emp=new Employees(100, "Amit", "10000");
//	al.add(emp); //first way to add employees data
	
	//Another way we can directly call Employees class constructor here
	al.add(new Employees(101, "Sumit", "15000"));
	al.add(new Employees(102, "Rushi", "20000"));
	
	
	//fist way to print by using simple sysout
	System.out.println(al);
	
	//second way to print by using Iterator
	Iterator<Employees> itr=al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	//Third way to print by using For-Each loop
	for(Employees employee:al) {
		System.out.println(employee);
	}
  }

}
