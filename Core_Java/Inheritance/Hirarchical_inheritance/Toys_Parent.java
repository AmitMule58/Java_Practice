package Hirarchical_inheritance;

public class Toys_Parent { // Parent Class
	void toys() {  //creating a method
		System.out.println("Toys is a parnet class");
	}
	
	public static void main(String[] args) { // Main method for object creation
	Train train=new Train();//object of parent class
	train.toys();
	train.train();
	
	
	Doll doll=new Doll();//object of child class
	doll.toys();
	doll.doll();
	
	Truck truck=new Truck();
	truck.toys(); 
	truck.truck();
			
	
	}

}
