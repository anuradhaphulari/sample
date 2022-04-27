package arraylistDemo;
import java.util.*;
public class ArrayListDemo1 {
	public static void main(String args[])
	{//using parameterized constructor used Array as Parameter
		ArrayList<String>l1=new ArrayList<String>(Arrays.asList("apple","banana","mango"));
		//ArrayList<Integer>l2-new ArrayList<Integer>();
		
		System.out.println(l1);
		l1.add("greps");
		l1.add(1, "watermelon");
		System.out.println(l1);
		l1.clone();
		System.out.println(l1);
		System.out.println(l1.contains("banana"));
		l1.addAll(2, l1);
		System.out.println(l1);
		//Avoid duplication from arraylist using HashSet
		Set <String>s= new HashSet<String>(l1);
		System.out.println(s);
		//remove element from arraylist
		l1.remove(2);
		l1.remove("banana");
		//update element from arraylist
		l1.set(3, null);
		System.out.println(l1);
		
		
	}

}
