package LinkedList;

import java.util.LinkedList;
//Demonstrate LinkedList

public class LinkedListDemo {
public static void main(String[] args) {
LinkedList<String> ll=new LinkedList<String>();
ll.add("LinkedList");// first index
ll.add("amit");//2nd index
ll.add("xyz");//3rd index
ll.addFirst("mule");// it will added to 0th index
ll.addLast("abc");// it will added to last index
ll.set(3, "pqr");// it will replaced at 3 index
//ll.removeFirst();
System.out.println(ll);//prints all elements of linked list

System.out.println(ll.contains("amit"));// true yes it contains amit in it.
System.out.println(ll.get(2));// amit bcause its present on 2nd index
System.out.println(ll.getFirst());// mule because its present in 0th index
System.out.println(ll.getLast());// abc last index
	}

}
