package Basic;

// Enter days & count how many years, weeks & days
import java.util.Scanner;

public class DaysToYears {
	public static void main(String[] args) {
		int days;
		System.out.println("Enter Days: ");
		Scanner sc = new Scanner(System.in);
		days = sc.nextInt();
		int year = days / 365;
		int week = (days - (year * 365)) / 7;
		int day = (days - (year * 365)) % 7;

		System.out.println(year + " year" + " " + week + " week" + " " + day + " days");

	}
}
