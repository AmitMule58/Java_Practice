package MethodOverriding;

public class Rectangle extends Shape {

	public void cal_area() {
		super.cal_area();
		double area=d1*d1;
		System.out.println("Area of rectangle is: "+ area);
		System.out.println();
	}
}
