package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program1 {

	public static void main(String[] args) {

		Collection<Integer> c1 = new ArrayList<>();

		c1.add(10);
		c1.add(15);
		c1.add(35);
		c1.add(52);
		c1.add(45);

		for (int n : c1) {
			System.out.print(n + " ");
		}

	}

}
