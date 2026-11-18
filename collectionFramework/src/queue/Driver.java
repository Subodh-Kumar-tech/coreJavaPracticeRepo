package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Driver {
	public static void main(String[] args) throws InterruptedException {

		Queue<Task> tasks = new PriorityQueue<>();

		tasks.add(new Task("cleaning", 20, 15000, 12));
		tasks.add(new Task("building", 45, 25000, 25));
		tasks.add(new Task("household", 2, 10000, 5));
		tasks.add(new Task("painting", 52, 45000, 28));
		tasks.add(new Task("loading", 24, 5543, 21));

		System.out.println(tasks);
		System.out.println();

		while (!tasks.isEmpty()) {
			System.out.println(tasks.poll());
			Thread.sleep(1000);
		}

	}
}
