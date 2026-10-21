package multiThreading.withMultithreading;

public class CalculateDriver {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main starts");
		Calculate c1 = new Calculate(500000558L);
		Calculate c2 = new Calculate(1000000505L);
		Thread t3 = new Thread(new Calculate(100250440L));

		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);

		long startTime = System.currentTimeMillis();
		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
		long endTime = System.currentTimeMillis();

		System.out.println("Total time taken in excution is : " + (endTime - startTime) / 1000);
		System.out.println("main ends");
	}

}
