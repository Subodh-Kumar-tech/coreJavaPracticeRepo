package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Program3 {
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();
		dq.offer(23);
		dq.offer(40);
		dq.offer(22);
		dq.offer(45);
		dq.offer(66);

		while (!dq.isEmpty()) {
			System.out.println(dq.poll());
		}
	}

}