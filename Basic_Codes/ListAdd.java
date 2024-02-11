package Basic;

import java.util.ArrayList;

public class ListAdd {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);

		ArrayList<Integer> list1 = new ArrayList<Integer>(list);
		list1.add(40);
		list1.add(50);
		list1.add(60);
//		System.out.println(list1);

		list1.addAll(list);
		System.out.println(list1);

	}

}
