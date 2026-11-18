package producerConsumer;

import java.util.LinkedList;

public class Container {

	private int size = 5;
	private LinkedList<Integer> buffer = new LinkedList<>();

	public synchronized void produce(int n) throws InterruptedException {

		if (buffer.size() == size) {
			wait();
		}
		buffer.addLast(n);
		System.out.println("Producer produce " + n + "th Gulab Jamun");
		notify();

		// if there is more than two or multiple thread then use notifyAll

	}

	public synchronized int consume() throws InterruptedException {
		if (buffer.size() == 0) {
			wait();
		}

		int n = buffer.removeFirst();
		System.out.println("Consumer consume " + n + "th Gulab Jamun");
		notify();

		return n;

	}

}
