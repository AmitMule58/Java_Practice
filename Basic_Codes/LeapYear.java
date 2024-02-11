package Basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter any Year: ");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("This is Leap Year");
		}
		else {
			System.out.println("This is not Leap Year");
		}
	}

}
