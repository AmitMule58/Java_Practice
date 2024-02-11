package Instance_Method;

public class Emp {
static String name;
static String address;

static String Comp(String n, String a) {
	n=name;
	a=address;
	return (n);
}

public static void main(String[] args) {
	System.out.println(Comp("amit", "pune"));
	
	
}
}
