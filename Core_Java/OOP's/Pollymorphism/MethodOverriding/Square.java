package MethodOverriding;

import java.util.Scanner;

public class Square extends Shape {
	@Override
public void cal_area() {
	System.out.println("Enter Input for Square: ");
	d1=sc.nextDouble();
	double area=d1*d1;
	System.out.println("Area of square: "+area);
	System.out.println();
}
}
