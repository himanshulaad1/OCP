package Question8;

public class EmployeeFactory {
	public static TypeofEmployee typeofEmployee(String employee){
		
		switch(employee){
		
		case "FullTimeEmployee":
			return new FullTimeEmployee();
		case "PartTimeEmployee":
			return new PartTimeEmployee();
		default:
			return new ContractEmployee(); 
		}
		
	}

}
