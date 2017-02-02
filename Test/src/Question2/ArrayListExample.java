package Question2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Hello");
		list1.add("World");
		list1.add("From");
		list1.add("Himanshu");
		list1.add("Himanshu");//Duplicates allowed
		list1.add("Laad");
		System.out.println(list1);
		
		list1.remove(1);
		list1.remove("Himanshu");
		System.out.println(list1);
	}

}
