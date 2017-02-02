package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();
		Employee e1 = new Employee("Himanshu", "","Laad");
		Employee e2 = new Employee("Himanshu", "S","Laad");
		Employee e3 = new Employee("Apurv", "L","Vyas");
		Employee e4 = new Employee("Snehal","P","Kanungo");
		Employee e5 = new Employee("Enosh","N","Borde");
		
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		
		Collections.sort(employee,(s1,s2)-> s1.getfName().compareTo(s2.getfName()));
		System.out.println(employee);
	}

}