package raceCondition;

public class User extends Thread {

	String name;
	BookMyShow b;
	int n;

	User() {

	}

	User(String name, BookMyShow b, int n) {
		this.name = name;
		this.b = b;
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 1; i <= n; i++) {
			b.increase();
		}
	}

}
