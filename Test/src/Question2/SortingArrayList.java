package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
	
public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("Hello");
		list1.add("World");
		list1.add("From");
		list1.add("Himanshu");
		list1.add("Himanshu");//Duplicates allowed
		list1.add("Laad");
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println("After sorting ="+list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(2);
		list2.add(13);
		list2.add(8);
		list2.add(5);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println("After sorting ="+list2);
		
		List<Employee> list3 = new ArrayList<>();
		//list3.add("");

	}
}