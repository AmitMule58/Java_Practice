package Basic;

import java.util.Scanner;

public class Course {
	String sname;
	int fee = 5000;

	public void Student() {
		System.out.println("Enter Student Name: ");
		Scanner sc = new Scanner(System.in);
		sname = sc.next();

	}

	private void Fees() {
		System.out.println("Enter fee Amount: ");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int duefee = fee - amount;
		System.out.println("Student name: " + sname);
		System.out.println("Fee Deus are: " + duefee);

	}

	public static void main(String[] args) {
		Course c = new Course();
		c.Student();
		c.Fees();
	}

}
