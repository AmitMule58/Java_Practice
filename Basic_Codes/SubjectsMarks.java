package Basic;
import java.util.Scanner;

public class SubjectsMarks {
public static  void main(String[]args) {
	
	Scanner marks=new Scanner(System.in);
	System.out.println("Enter the Marks");
	
	System.out.println("English:");
	int English=marks.nextInt();
	
	System.out.println("Marathi");
	int Marathi=marks.nextInt();
	
	System.out.println("Hindi");
	int Hindi=marks.nextInt();
		
	System.out.println("Geography");
	int Geography=marks.nextInt();
	
	System.out.println("History");
	int History=marks.nextInt();
	
	int total= English + Marathi + Hindi + Geography + History;
	System.out.println("Total of all subject marks: " + total);
	
	float avg=total/5;
	System.out.println("Avg. of all marks: "+avg);
	
}
}
