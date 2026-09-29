package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program10 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(14);
		l.add(24);
		l.add(34);
		l.add(42);
		l.add(54);

		int res = l.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElseThrow();

		System.out.print(res);

	}

}
