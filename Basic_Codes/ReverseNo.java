package Basic;

public class ReverseNo {
	public static void main(String[] args) {
//		int num=123;
//		
//		int a=num%10;
//			num=num/10;
//			
//			int b=num%10;
//			num=num/10;
//			
//			int c=num%10;
//			num=num/10;
//			
//			System.out.println("reverse no is: "+a+b+c);

		// using loop

		int n = 123;
		int rem, rev = 0;
		while (n != 0) {
			rem = n % 10;
			n = n / 10;
			rev = rev * 10 + rem;
			System.out.println(rev);

		}

	}
}
