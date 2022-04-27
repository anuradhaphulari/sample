package arraylistDemo;
import java.util.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//used other linked list as parameter
ArrayList<Integer> l2=new ArrayList<Integer>();
l2.addAll(Arrays.asList(4,3,2,1,7,5,6));
System.out.println(l2);
ArrayList<Integer> l3=new ArrayList<Integer>(l2);
System.out.println(l3);
	}

}
