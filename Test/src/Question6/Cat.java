package Question6;

public class Cat extends AbstractClass implements Animal {

	@Override
	public void eat() {
		System.out.println("Cat drinks milk");
	}

	@Override
	public void Wakeup() {
		System.out.println("Every animal should wakeup at 6 AM");
		
	}

}
