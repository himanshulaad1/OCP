package Question2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingArrayList {

	public static void main(String[] args) {
	
	List<String> list1 = new ArrayList<>();
	list1.add("Hello");
	list1.add("World");
	list1.add("From");
	list1.add("Himanshu");
	list1.add("Himanshu");//Duplicates allowed
	list1.add("Laad");
	
	
	for (String string : list1) {
		System.out.println(string);
	}
	
	Iterator<String> itr = list1.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	
	}
}
