package Basic;

public class ReverseString {

	public static void main(String[] args) {
		String str = "AMIT";
		String str1 = " ";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			str1 = ch + str1;
		}
		System.out.println("original string: " + str);
		System.out.println("reverse string: " + str1);
	}

}
