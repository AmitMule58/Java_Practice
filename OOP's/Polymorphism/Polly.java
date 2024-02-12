package Pollymorphism;
// same method name but different arguments

public class Polly {
void add() {
	System.out.println(5+5);
}
void add(int a) {
	System.out.println(a+6);
}
void add(int a, int b) {
	System.out.println(a+b+6);
}
public static void main(String[] args) {
	Polly polly=new Polly();
	polly.add();
	polly.add(5);
	polly.add(5, 5);
}
}
