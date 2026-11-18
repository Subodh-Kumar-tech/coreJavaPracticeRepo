package threadPool;

public class Task extends Thread {

	String name;

	Task() {

	}

	Task(String name) {
		this.name = name;
	}

	public void run() {

		System.out.println(name + " is executed by Thread : " + Thread.currentThread().getName());
	}
}
