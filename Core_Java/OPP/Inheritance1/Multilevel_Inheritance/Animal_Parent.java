package Multilevel_Inheritance;
// This is multi-level Inheritance
public class Animal_Parent { // parent class

	void animals() {
		System.out.println("they just eat & sleep");
	}
	
	public static void main(String[] args) {
		baby_cat baby=new baby_cat();
		baby.kitten();
		baby.animals();
		baby.cat();
	}

}
