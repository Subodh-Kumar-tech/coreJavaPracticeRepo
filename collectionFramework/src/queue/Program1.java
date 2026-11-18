package queue;

import java.util.PriorityQueue;

public class Program1 {

	public static void main(String[] args) {

//		Queue<Integer> q1 = new PriorityQueue<>();

		// Queue<Integer> q1 = new PriorityQueue<>(Comparator.reverseOrder());

		PriorityQueue<Integer> q1 = new PriorityQueue<>();

		// to add element in queue
		q1.add(10);
		q1.add(25);
		q1.add(52);
		q1.add(45);
		q1.add(32);
		q1.add(48);
		q1.add(15);

		q1.offer(72);

		System.out.print(q1);

		System.out.println();

		// to get first element
		System.out.println(q1.peek());
		System.out.println(q1.element());

		// to remove first element

		System.out.println(q1.remove());
		System.out.println(q1.poll());

		System.out.println(q1.size());
	}

}
