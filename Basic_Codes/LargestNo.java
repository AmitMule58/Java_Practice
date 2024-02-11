package Basic;

import java.util.Scanner;

public class LargestNo {
	public static void main(String[] args) {
//*******user defined*********
//	int a=6;
//	int b=3;
//
//	System.out.println((a>b && b>a)); //T && F =False
//	System.out.println((a>b || b<a));//T || T  =True

//******user deffined********
		
		System.out.println("Enter the number: ");
		Scanner Sc = new Scanner(System.in);
		int num = Sc.nextInt();

		System.out.println(num > 10 && num > 100);
		System.out.println(num > 10 || num > 100);
	}
}
