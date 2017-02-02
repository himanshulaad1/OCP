package Question2;

import java.util.Set;
import java.util.TreeSet;

public class Question4 {
	public static void main(String[] args) {
		
		Set<Employee> set = new TreeSet<>(new EmployeeComparator());
		
		Employee e1 = new Employee("Himanshu", "","Laad");
		Employee e2 = new Employee("Himanshu", "S","Laad");
		Employee e3 = new Employee("Apurv", "L","Vyas");
		Employee e4 = new Employee("Snehal","P","Kanungo");
		Employee e5 = new Employee("Enosh","N","Borde");
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		System.out.println(set);
		
		
	}

}
