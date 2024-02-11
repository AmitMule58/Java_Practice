package Basic;

import java.util.Scanner;

public class BankAc {

	int ballance;
	int withdraw;
	int total;

	void Deposit() {

		System.out.println("Enter amount to deposite: ");
		Scanner sc1 = new Scanner(System.in);
		ballance = sc1.nextInt();
		total = total + ballance;
		System.out.println("Current balance: " + total);
	}

	void withdraw() {

		System.out.println("Enter amount to withdraw: ");
		Scanner sc = new Scanner(System.in);
		int with = sc.nextInt();
		if (with >= 100) {
			int newballance = total - with;
			System.out.println("Your New balance is: " + newballance + " Rupees.");
		} else {
			System.out.println("You Cannot withdraw less than 100 Rupees!!");
		}
	}

	public static void main(String[] args) {
		BankAc bankac = new BankAc();
		bankac.Deposit();
		bankac.withdraw();

	}

}
