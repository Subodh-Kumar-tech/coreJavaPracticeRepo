package exceptionHandling;

public class Car extends RuntimeException {
	Engine e;

	public static void main(String[] args) {
		System.out.println("Program start");
		throw new Car();

	}

}