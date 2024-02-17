package Pollymorphism;
//same method name but different arguments

public class Static {
	 
static void polly() {
	System.out.println("no arg: ");

}
static void polly(int a, int b) {
	System.out.println("2 args: "+(a*b*6*5));	
}
public static void main(String[] args) {
	polly();
	polly(5, 6);
}
}

