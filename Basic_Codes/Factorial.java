package Basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;

		System.out.println("Enter Factorial no: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			fact = fact * i;

			System.out.println("Factorial of " + num + " is " + fact);

		}

 	}

}
