package deadLock;

public class User extends Thread {

	String name;
	String r1;
	String r2;

	User() {

	}

	User(String name, String r1, String r2) {
		this.name = name;
		this.r1 = r1;
		this.r2 = r2;
	}

	public void run() {
		System.out.println(name + " has starts playing =========");
		synchronized (r1) {
			System.out.println(name + " has taken " + r1);
			synchronized (r2) {
				System.out.println(name + " has taken " + r2 + " also");
				System.out.println(name + " is playing with " + r1 + " and " + r2);
			}
			System.out.println(name + " has done with playing and resource is free now ");
		}

	}

}
