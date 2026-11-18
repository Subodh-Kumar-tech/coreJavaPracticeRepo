package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program2 {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

		q.offer(12);
		q.offer(45);
		q.offer(50);
		q.offer(20);
		q.offer(8);
		q.offer(33);
		q.offer(5);
		q.offer(20);

		System.out.println(q);

	}

}
