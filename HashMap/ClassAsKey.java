package HashMap;

import java.util.HashMap;

//Can we take the custom class as a key
public class ClassAsKey {
	public static void main(String[] args) {
		// Design the HashMap which will Employee as key
		HashMap<Employee, String> hash=new HashMap<Employee, String>();
		
		//Create an object of Employee Class to put it into the map
		Employee emp=new Employee();
		Employee emp1=new Employee();//here I want NAME also so I create new obj
		
		hash.put(emp, emp.getSalary()); // using emp object as key & emp.getSalary as value
		hash.put(emp1, emp1.getName()); // if we want other fields create new object,
		
		System.out.println("Value will be the >> "+hash.get(emp)); //printing the HashMap
		System.out.println("Value will be the >> "+hash.get(emp1)); //printing the HashMap

	}
	
}
