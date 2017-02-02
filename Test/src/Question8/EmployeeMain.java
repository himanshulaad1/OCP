package Question8;

public class EmployeeMain {
	public static void main(String[] args) {
		TypeofEmployee toe = EmployeeFactory.typeofEmployee("FullTimeEmployee");
		TypeofEmployee toe1 = EmployeeFactory.typeofEmployee("PartTimeEmployee");
		TypeofEmployee toe2 = EmployeeFactory.typeofEmployee("ContractEmployee");
		toe.EmployeeType();
		toe1.EmployeeType();
		toe2.EmployeeType();
	}

}
