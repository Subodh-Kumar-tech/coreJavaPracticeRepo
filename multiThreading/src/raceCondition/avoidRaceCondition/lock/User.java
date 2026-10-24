package raceCondition.avoidRaceCondition.lock;

public class User extends Thread {

	String name;
	int n;
	BookMyShow b;

	User() {

	}

	User(String name, int n, BookMyShow b) {
		this.name = name;
		this.n = n;
		this.b = b;

	}

	@Override
	public void run() {
//		System.out.println(name + "starts");
		for (int i = 1; i <= n; i++) {
			b.increament();
		}
//		System.out.println("ticket booked");
	}

	public String toString() {
		return "Name : " + name + "\t+NO of tickets : " + n;
	}
}
