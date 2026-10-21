package multiThreading.withMultithreading;

public class calculateDriver2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main starts");

		Runnable r1 = () -> {
			long num = 1000L;
			for (int i = 0; i <= num; i++) {
				System.out.println("valuees are : " + i);
			}
		};
		Runnable r2 = () -> {
			long num = 100000L;
			for (int i = 0; i <= num; i++) {
				System.out.println("valuees are : " + i);
			}
		};
		Runnable r3 = () -> {
			long num = 100000L;
			for (int i = 0; i <= num; i++) {
				System.out.println("valuees are : " + i);
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

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
