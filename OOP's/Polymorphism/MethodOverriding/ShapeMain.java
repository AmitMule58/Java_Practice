package MethodOverriding;

public class ShapeMain {
public static void main(String[] args) {
	Rectangle rec=new Rectangle();
//	rec.cal_area();
	rec.user_input();
	rec.cal_area();
	
	Circle cr=new Circle();
	cr.cal_area();
	cr.user_input();
	
	Square sq=new Square();
	sq.cal_area();
	sq.user_input();
	
}
}


//same method name and diff parameters--overloading
//same method-- overriding