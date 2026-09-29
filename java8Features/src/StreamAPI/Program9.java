package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program9 {

	public static void main(String[] args) {

		// skip

		List<Integer> l = new ArrayList<>();

		l.add(14);
		l.add(28);
		l.add(34);
		l.add(45);
		l.add(56);
		l.add(22);

//		l.stream().skip(2).forEach(n -> System.out.print(n + " "));

//		int res = l.stream().skip(2).findFirst().get();

		int k = 3;
//		int res = l.stream().sorted().skip(k - 1).findFirst().orElseThrow();

		int res = l.stream().sorted(Comparator.reverseOrder()).skip(k - 1).findFirst().orElseThrow();

		System.out.print(res);

	}

}
