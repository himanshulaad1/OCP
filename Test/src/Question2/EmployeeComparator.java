package Question2;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getfName().compareTo(o2.getfName());
	}
}
