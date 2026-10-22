package multiThreading.withMultithreading;

public class LaptopDriver {

	public static void main(String[] args) throws InterruptedException {

		Laptop l1 = new Laptop("Hp");
		Laptop l2 = new Laptop("Dell");
		Laptop l3 = new Laptop("Asus");

		l1.start();

		l1.interrupt();
		l2.start();

		/*
		 * l2.sleep(1000); l2.interrupt();
		 * 
		 * l2.interrupted(); l2.isInterrupted();
		 * 
		 * 
		 */

		l3.start();

//		l1.join();
//		l2.join();
//		l3.join();
	}

}
