package Basic;

public class Swap2 {
public static void main(String[]args) {
	int a=10;
	int b=20;
	
	System.out.println("current values are: "+ "a="+a+" " +"b="+b);
	a=a+b; //10+20
	b=a-b; //10-20
	a=a-b; //10-20
	System.out.println("After Swapping current values are: "+ "a="+a+" " +"b="+b);

	
}
}
