package HashMap;

import java.util.HashMap;

//Can we take custom class as key
public class MapDemo1 {
	public static void main(String[] args) {
		// Design the HashMap which will Employee as key
		HashMap<Employee, String> hash=new HashMap<Employee, String>();
		
		//Create object of Employee Class for put it into map
		Employee emp=new Employee();
		Employee emp1=new Employee();//here i want NAME also so i create new obj
		
		hash.put(emp, emp.getSalary()); // using emp object as key & emp.getSalary as value
		hash.put(emp1, emp1.getName()); // if we want other fields create new object,
		
		System.out.println("Value will be the >> "+hash.get(emp)); //printing the HashMap
		System.out.println("Value will be the >> "+hash.get(emp1)); //printing the HashMap

	}
	
}
