package MethodOverriding;

import java.util.Scanner;

public class Shape {
Scanner sc=new Scanner(System.in);
double d1, d2;

public void user_input(){
	System.out.println("Enter Dimension 1 & 2: ");
	d1=sc.nextDouble();
	d2=sc.nextDouble();
}
public void cal_area() {
	System.out.println("Calculating area...!");
}
}
