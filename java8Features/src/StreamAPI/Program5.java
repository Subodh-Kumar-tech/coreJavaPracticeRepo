package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Program5 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(12);
		l.add(26);
		l.add(34);
		l.add(18);
		l.add(12);

		l.stream().sorted().forEach(n -> System.out.print(n + " "));

		System.out.print("\n" + l);

	}

}
