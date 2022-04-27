package arraylistDemo;
import java.util.stream.Stream;
import java.util.*;


public class Example_collectionbasics_1 {
	
	//public class Example_collectionbasics_1 {

		public static void main(String[] args) {
			/*
			 * ArrayList<String> arr= new ArrayList<String>(); arr.add("Ravi");
			 * arr.add("Joseph"); arr.add("Kiran");
			 * 
			 * Iterator itr=arr.iterator(); while(itr.hasNext()) {
			 * System.out.println(itr.next()); }
			 */
			
			List<Integer> ex1= new ArrayList<Integer>();
			ex1.add(10);
			ex1.add(30);
			ex1.add(140);
			
			List<Integer> ex2= new ArrayList<>();
			ex2.add(20);
			ex2.add(40);
			ex2.add(40);
			
			// ex1.addAll(ex2);
			ex2.addAll(ex1);
			
			System.out.println(ex2);
			System.out.println(ex2.size());
			ex2.remove(2);
			System.out.println(ex2);
			
			ex2.clear(); 
			System.out.println(ex2);
			 
			
		}


	}

