package Basic;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int temp = 0;

		System.out.println("Enter Any no: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 1) {
			System.out.println(no + " is Not a Prime no");
		} else
			System.out.println(no + " is a Prime no");

	}

}
