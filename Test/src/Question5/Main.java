package Question5;

public class Main {
	
	private Status status;
	
	public Main(Status status){
		this.status = status;
	}
	public static void main(String[] args) {
		
		Main obj = new Main(Status.PLACED);
		
		//Changing status
		System.out.println(obj.status.PLACED);
		System.out.println(obj.status.ordinal());
	}

}
