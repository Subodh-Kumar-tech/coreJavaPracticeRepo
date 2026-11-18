package producerConsumer;

public class Producer extends Thread {

	String name;
	Container c;
	int n;

	Producer() {

	}

	Producer(String name, Container c, int n) {
		this.name = name;
		this.c = c;
		this.n = n;

	}

	public void run() {
		for (int i = 1; i <= n; i++) {
			try {
				c.produce(i);
				Thread.sleep(200);

			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		}
	}

}
