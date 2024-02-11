package Switch_Case;

import java.util.Scanner;

public class Calculator {
public static void main(String[]args) {
	float num1;
	float num2;
	char c;
	Scanner sc=new Scanner(System.in);
	num1=sc.nextFloat();
	num2=sc.nextFloat();
	
	System.out.println("+ \n- \n* \n/");
	c=sc.next().charAt(0);
	
	switch(c) {
	
	case '+':
		float ans=num1+num2;
		System.out.println(ans);
		break;
		
	case '-':
		ans=num1-num2;
		System.out.println(ans);
		break;

	case '*':
		ans=num1*num2;
		System.out.println(ans);
		break;
		
	case '/':
		ans=num1/num2;
		System.out.println(ans);
		break;
		
		default:
		System.out.println("Invalid Input!!");
	}
	
	
	
}
}
