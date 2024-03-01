package Multilevel_Inheritance;
// Simple Inheritance

class Subject {
	int a;

void display() {
	System.out.println("These are normal stream subs>>");
}
}
class Science extends Subject{
	void show() {
		System.out.println("These are science stream subs>>");
	}
	
	public static void main(String[] args) {
	
		Science s=new Science();
		s.display();
		s.show();
		s.a=5;
		System.out.println(s.a);}
}
