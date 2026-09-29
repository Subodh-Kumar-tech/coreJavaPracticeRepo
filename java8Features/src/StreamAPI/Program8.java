package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program8 {

	public static void main(String[] args) {

		// sort using comparator

		List<Integer> l = new ArrayList<>();

		l.add(15);
		l.add(24);
		l.add(34);
		l.add(26);
		l.add(52);

		// in natural order using comparator
		l.stream().sorted(Comparator.naturalOrder()).forEach(n -> System.out.print(n + " "));

		// in reversed order using comparator
		System.out.println();

		l.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " "));
	}

}
