package Switch_Case;

import java.util.Scanner;

public class SwitchFromUser {
public static void main(String[]argts) {
	int num1;
	int num2;
	int c;
	System.out.println("Enter two numbers: ");
	Scanner sc=new Scanner(System.in);
	num1=sc.nextInt();
	num2=sc.nextInt();
	System.out.println("Enter your Choice: ");
	System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division ");
	c=sc.nextInt();
	 
	switch(c)
	{
	case 1:
		int res;
		res=num1+num2;
		System.out.println("Addition of given no is: "+res);
		break;
	case 2:
		res=num1-num2;
		System.out.println("Subtraction of given no is: "+res);
		break;
		
	case 3:
		res=num1*num2;
		System.out.println("Multiplication of given no is: "+res);
		break;
		
	case 4:
		res=num1/num2;
		System.out.println("Division of given no is:"+res);
		break;
		
		default:
		System.out.println("Invalid Number!!!");
	}

}
}
