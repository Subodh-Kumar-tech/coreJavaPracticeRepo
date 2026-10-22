package raceCondition;

public class Driver {

	public static void main(String[] args) throws InterruptedException {

		BookMyShow b = new BookMyShow();

		User u1 = new User("sohan", b, 1000);
		User u2 = new User("mohan", b, 1500);
		User u3 = new User("rohan", b, 500);
		User u4 = new User("john", b, 100);
		User u5 = new User("miller", b, 400);

		u1.start();
		u2.start();
		u3.start();
		u4.start();
		u5.start();

		u1.join();
		u2.join();
		u3.join();
		u4.join();
		u5.join();

		System.out.println("count : " + b.count);

	}

}
