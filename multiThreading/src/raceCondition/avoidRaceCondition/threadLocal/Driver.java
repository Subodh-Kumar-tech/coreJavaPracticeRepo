package raceCondition.avoidRaceCondition.threadLocal;

public class Driver {

	public static void main(String[] args) throws InterruptedException {

//		System.out.println("main starts ");
		BookMyShow b = new BookMyShow();

		User u1 = new User("sohan", 1000, b);
		User u2 = new User("mohan", 1500, b);
		User u3 = new User("rohan", 2500, b);

		u1.start();
		u2.start();
		u3.start();

		u1.join();
		u2.join();
		u3.join();

//		System.out.println(b.getCount());

//		System.out.println("main ends ");

	}

}
