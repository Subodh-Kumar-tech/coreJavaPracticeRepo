package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<>();

		l.add(12);
		l.add(25);
		l.add(34);
		l.add(52);
		l.add(15);

		// using for each loop
		for (int x : l) {
			if (x % 2 == 0) {
				System.out.print(x + " ");
			}
		}

		System.out.println();

		// using stream api and for each method
		l.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));

	}

}
