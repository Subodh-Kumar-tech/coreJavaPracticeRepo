package producerConsumer;

public class Consumer extends Thread {

	String name;
	Container c;
	int n;

	Consumer() {

	}

	Consumer(String name, Container c, int n) {
		this.name = name;
		this.c = c;
		this.n = n;

	}

	public void run() {

		for (int i = 1; i <= n; i++) {

			try {
				c.consume();
				Thread.sleep(400);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
