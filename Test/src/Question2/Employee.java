package Question2;

public class Employee implements Comparable<Employee>{


	private String fName;
	private String lName;
	private String mName;
	
	
	public Employee(String fName, String lName, String mName) {
		this.fName = fName;
		this.lName = lName;
		this.mName = mName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee s = (Employee) obj;
		return this.getfName().equals(s.getfName());
	}
	public int hashCode() {
		return this.fName.hashCode()+this.fName.hashCode();
	}
	
	public int compareTo(Employee o) {
		return this.getfName().compareTo(o.getfName());
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", mName="
				+ mName + "]";
	}
}
