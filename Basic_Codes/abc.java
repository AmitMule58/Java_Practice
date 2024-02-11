package Basic;

import java.util.Scanner;

//Ask a user where to start while loop or where to stop
public class abc {
	public static void main(String[] args) {
		System.out.println("Enter a number where to start a loop: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter no for whrere to stop a loop: ");
		int num1 = sc.nextInt();

		for (int i = num; i <= num1; i++) {
			System.out.println(i);
		}
	}

}
