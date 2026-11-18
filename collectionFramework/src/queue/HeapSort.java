package queue;

import java.util.PriorityQueue;

public class HeapSort {

	public static void main(String[] args) {

		int[] a = { 10, 52, 35, 14, 78, 56, 28, 12 };

		heapSort(a);

		for (int n : a) {
			System.out.print(n + " ");
		}

	}

	public static void heapSort(int[] a) {

		PriorityQueue<Integer> q = new PriorityQueue<>();

		for (int n : a) {
			q.offer(n);
		}

		for (int i = 0; i < a.length; i++) {
			a[i] = q.poll();
		}
	}

}
