package Basic;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
//		System.out.print(3+7);
//		System.out.println(-3+6);
//		System.out.println(-4+7);
//		System.out.println(5+83);

		int a = 0;
		int b = 0;
		int sum;
		// using scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first values: ");
		a = sc.nextInt();

		System.out.println("Enter Second values: ");
		b = sc.nextInt();

		sum = a + b; // addition stored in sum variable
		System.out.println("Sum of Two no is " + sum);

		// Another way
//	System.out.println("Addition of a & b is: " + (a+b));

	}

}
