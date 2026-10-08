package abstraction.interface2;

public class Car implements Runnable {

	@Override
	public void run() {
		System.out.println("car is running");
	}
}
