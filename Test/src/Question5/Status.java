package Question5;

public enum Status {
	
	NEW
	{
		@Override
		public void add() {
			System.out.println("New override add");
			
		}
	},	
	PLACED
	{
		@Override
		public void add() {
			System.out.println("Placed override add");
		}
	};	
	public abstract void add();
}
