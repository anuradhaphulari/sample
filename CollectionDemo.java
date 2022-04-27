package arraylistDemo;
import java.util.*;


public class CollectionDemo {

	static public void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> ex2= new ArrayList<String>();
		ex2.add("apple");
		ex2.add("banana");
		System.out.println(ex2);
		List <Integer> ex= new ArrayList<Integer>();

ex.add(10);
ex.add(11);
ex.add(12);
System.out.println(ex.size());
List <Integer> ex1= new ArrayList<Integer>();
//add elements from other arraylist
ex1.addAll(ex);
System.out.println(ex1);
ex1.add(37);
ex1.add(68);
//ex1.removeAll(ex);
System.out.println(ex1);
System.out.println(ex.contains(75));
Iterator itr=ex.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
Integer a= Collections.max(ex1);
System.out.println(a);
	}
}
	
