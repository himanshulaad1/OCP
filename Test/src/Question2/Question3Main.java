package Question2;

import java.util.HashSet;
import java.util.Set;

public class Question3Main {
	
	public static void main(String[] args) {
		//Sorting only with firstname
		Set<Employee> set1 = new HashSet<>();
		Employee e1 = new Employee("Himanshu", "","Laad");
		Employee e2 = new Employee("Himanshu", "S","Laad");
		Employee e3 = new Employee("Apurv", "L","Vyas");
		Employee e4 = new Employee("Snehal","P","Kanungo");
		Employee e5 = new Employee("Enosh","N","Borde");
		set1.add(e1);
		set1.add(e2);
		set1.add(e3);
		set1.add(e4);
		set1.add(e5);
		System.out.println(set1);
		
	}

}
