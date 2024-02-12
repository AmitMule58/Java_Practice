package Pollymorphism;
//same method name but different arguments

public class Area {
public void div() {
	System.out.println(10/2);
}
void div(int a, int b) {
	System.out.println("2 parameters: "+(a/b));
}
void div (float a, float b, float c) {
	System.out.println("3 parameters: "+(a+b/c));
}
void div(double a, double b, double c, double d) {
	System.out.println("4 parameters: "+"a"+"b"+"c"+"d");
}
void div(String a, String b, String c, String d, String e) {
	System.out.println("5 Parameters: "+(a+b+c+d+e));
}

public static void main(String[] args) {
	Area area=new Area();
	area.div();
	area.div(20, 10);
	area.div(5, 10, 5);
	area.div(0.2, 1.2, 2.2, 2);
	area.div("Hi ", "hello ","everyone ", "i am ", "happy ");
}
}
