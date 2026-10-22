package list;

import java.util.ArrayList;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {

		// sorting element by using sort method of list and providing comparator
		// implemention by lambda expression

		List<Integer> l1 = new ArrayList<>();

		l1.add(10);
		l1.add(15);
		l1.add(35);
		l1.add(52);
		l1.add(45);

		l1.add(2, 82);

		for (int n : l1) {
			System.out.print(n + " ");
		}

		System.out.println();

		// get element by index
		System.out.println(l1.get(2));

		// sorting on the basis of element value in natural order
		l1.sort((n1, n2) -> n1 - n2);

		for (int n : l1) {
			System.out.print(n + " ");
		}

		System.out.println();

		// reversed order
		l1.sort((n1, n2) -> n2 - n1);
		for (int n : l1) {
			System.out.print(n + " ");
		}

		System.out.println();

		// on the basis of last digit

		l1.sort((n1, n2) -> n1 % 10 - n2 % 10);
		for (int n : l1) {
			System.out.print(n + " ");
		}
		System.out.println();

		// on the digit sum value basis

		l1.sort((n1, n2) -> Program1.digitSum(n1) - Program1.digitSum(n2));
		for (int n : l1) {
			System.out.print(n + " ");
		}
	}

	public static int digitSum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
