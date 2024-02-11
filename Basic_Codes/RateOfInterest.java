package Basic;

import java.util.Scanner;

public class RateOfInterest {

	public static void main(String[] args) {
	
		System.out.print("Enter Duration: ");
		Scanner sc =new Scanner(System.in);
		int time=sc.nextInt();
		
		System.out.print("Enter Amount: ");
		int amount=sc.nextInt();
		int NewAmount=10*2+amount;
		
		if(time>30) {
			System.out.println("Rate of  Interest is 10% & total amount is >> "+NewAmount);
		}
		else
			System.out.println("Rate of Interest is 0% & total amount is >> "+NewAmount);
	}

}
