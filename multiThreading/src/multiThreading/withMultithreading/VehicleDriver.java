package multiThreading.withMultithreading;

public class VehicleDriver {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main starts");

		Vehicle v1 = new Vehicle("Truck", 200000);
		Vehicle v2 = new Vehicle("Car", 10);
		Vehicle v3 = new Vehicle("Bike", 25);
		Vehicle v4 = new Vehicle("Auto", 5);

		long startTime = System.currentTimeMillis();
		v1.start();
		v2.start();
		v3.start();
		v4.start();

		v1.join();
		v2.join();
		v3.join();
		v4.join();

		long endTime = System.currentTimeMillis();

		System.out.println("Total time taken in excution is : " + (endTime - startTime) / 1000);

		System.out.println("main ends");

	}

}
