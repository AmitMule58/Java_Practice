package Basic;

class Test1{
static int t;

Test1(){
	System.out.println("C1"); // then second line by line c1
	t=99;
}
static {
	t=100;
	System.out.println("S"); // first print static block
}
public void func() {
	t++;
	System.out.println("C"); //third  
}
public static void main(String[] args) {
	Test1 test=new Test1();
	test.func();
}
}
