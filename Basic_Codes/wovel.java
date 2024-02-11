package Basic;

import java.util.Scanner;

//wove l or consonant using relational or operator
public class wovel {
public static void main(String[] args) {
	System.out.println("Enter any caharactor: ");
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		System.out.println("This is wovel");
	}
	else  {
		System.out.println("This is Consonant");
	}

}
}

