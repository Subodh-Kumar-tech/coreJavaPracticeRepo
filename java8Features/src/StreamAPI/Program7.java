package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Program7 {

	public static void main(String[] args) {

		// reverse order

		List<Integer> l = new ArrayList<>();

		l.add(14);
		l.add(26);
		l.add(34);
		l.add(24);
		l.add(52);

		l.stream().sorted((n1, n2) -> n2 - n1).forEach(n -> System.out.print(n + " "));

	}

}
