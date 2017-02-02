package Question9;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ans {
	
	//list.indexOf() will give index of the element
	//list.get(index of element) will give value at index of.
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("H");
		list.add("I");
		list.add("M");
		System.out.println(list.indexOf("H"));
		System.out.println(list.get(1));
		
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("H");
		list1.add("I");
		list1.add("M");
		System.out.println(list.indexOf("H"));
		System.out.println(list.get(1));
	}

}
