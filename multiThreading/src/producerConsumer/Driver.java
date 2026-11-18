package producerConsumer;

public class Driver {

	public static void main(String[] args) {

		Container c = new Container();

		Producer p1 = new Producer("mohan", c, 30);
		Consumer c1 = new Consumer("sohan", c, 30);

		p1.start();
		c1.start();

	}
}
