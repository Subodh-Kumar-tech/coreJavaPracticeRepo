package multiThreading.withMultithreading;

public class Laptop extends Thread {

	String name;

	Laptop() {

	}

	Laptop(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " starts ");
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + " executed " + i + " secs");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();

				System.out.println("some body interrupted me ! i am " + name);
				System.out.println(e.getMessage());
			}
		}
		System.out.println(name + " ends");
	}

}
