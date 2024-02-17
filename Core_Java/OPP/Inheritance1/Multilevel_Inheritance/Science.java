package Simple_Inheritance;

class Science extends Subject{ // child class accessing parent class properties 
	void show() {
		System.out.println("from child: These are science stream subs>>");
	}
	
	public static void main(String[] args) {
	
		Science s=new Science();
		s.display(); // method from parent
		s.show();
		s.a=5; // accessing variable also
		System.out.println("variable from parent a >> "+s.a);
		
	}
}
