package Encapusulation;

import java.util.Scanner;

public class Main {
	
	 public static void getUserInput(){
		System.out.println("Enter Id: ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name=sc.next();
		
		System.out.println("Enter City: ");
		String city=sc.next();
		
		Employee emp=new Employee();
		emp.setEmployeeId(id);
		emp.setEmployeeName(name);
		emp.setEmployeeCity(city);
		
		System.out.println("Employee Id: "+emp.getEmployeeId());
		System.out.println("Employee Name: "+emp.getEmployeeName());
		System.out.println("Employee City: "+emp.getEmployeeCity());
		
	}

	public static void main(String[] args) {
		getUserInput(); // direct method calling
	
			
	}

}
