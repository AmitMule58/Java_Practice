package MethodOverriding;

public class Circle extends Shape{
	@Override
	public void cal_area() {
		System.out.println("Enter radius value: ");
		double r=sc.nextDouble();
		double area=3.14*r*r;
		System.out.println("Area of circle is: "+area);
		System.out.println();
	}

}
