package Methods;

public class Staticmethod {
	static void display()
	{
		System.out.println("This is static method 2");
	}

	static void show()
	{
		System.out.println("This is static method 1");
	}

	public static void main(String[] args) {
		display(); //we can access directly without creating object because its static methods
		show();
	}

}
