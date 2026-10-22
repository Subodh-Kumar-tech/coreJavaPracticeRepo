package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		l1.add(10);
		l1.add(52);
		l1.add(45);
		l1.add(15);
		l1.add(35);

		for (int n : l1) {
			System.out.print(n + " ");
		}

		System.out.println();

		// sorting element using naturalOrder method using comparator in ascending
		// order/natural Order
		l1.sort(Comparator.naturalOrder());
		for (int n : l1) {
			System.out.print(n + " ");
		}

		System.out.println();

		// sorting element in reverse order using comparator

		l1.sort(Comparator.reverseOrder());
		for (int n : l1) {
			System.out.print(n + " ");
		}

	}

}
