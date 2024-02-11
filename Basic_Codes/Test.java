package Basic;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>(List.of(2,1,2,3,4,5));
	list.subList(1, 4).clear();
	System.out.println(list);
}
}


//output is [1,5]
//if i pass (1,4) it print 1st element(from 1st index) & clear upto 4th index element
//& rest list will be print

//if i pass (2,4) it print 1st, 2nd element(from 1st to 2nd index) & clear upto 4th index element
//& rest list will be print