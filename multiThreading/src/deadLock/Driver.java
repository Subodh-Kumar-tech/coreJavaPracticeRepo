package deadLock;

public class Driver {

	public static void main(String[] args) {

		String r1 = "bat";
		String r2 = "ball";

		User u1 = new User("mohan", r1, r2);
		User u2 = new User("sohan", r2, r1); // cause deadlock
		// User u2 = new User("sohan", r1, r2); // not cause deadlock
		// to avoid deadlock resource should be shared in same way

		u1.start();
		u2.start();
	}

}
