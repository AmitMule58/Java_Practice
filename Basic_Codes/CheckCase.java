package Basic;

import java.util.Scanner;

public class CheckCase {

	public static void main(String[] args) {
		System.out.println("Enter any Character: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

// Using methods		
		if (Character.isLowerCase(ch)) {
			System.out.println("Its Lower Case");
		} else if (Character.isUpperCase(ch)) {
			System.out.println("Its Uppercase");
		} else if (Character.isDigit(ch)) {
			System.out.println("Its Digit");
		} else
			System.out.println("Invalid Input");

// USing ASCI Values  
//		if (ch > 65 && ch <= 93) {
//			System.out.println("Upper Case");
//		} else if (ch >= 97 && ch <= 125) {
//			System.out.println("Lower Case");
//		} else
//			System.out.println("Invalid Input!!");
	}
}