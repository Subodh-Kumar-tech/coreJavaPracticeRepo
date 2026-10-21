package multiThreading.withoutMultithreading;

public class VehicleDriver {

	public static void main(String[] args) {

		System.out.println("main starts");

		Vehicle v1 = new Vehicle("Truck", 20);
		Vehicle v2 = new Vehicle("Car", 10);
		Vehicle v3 = new Vehicle("Bike", 25);
		Vehicle v4 = new Vehicle("Auto", 5);

		v1.start();
		v2.start();
		v3.start();
		v4.start();

		System.out.println("main ends");

	}

}
