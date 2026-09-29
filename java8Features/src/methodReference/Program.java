package methodReference;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(25);
		l.add(35);
		l.add(45);
		l.add(55);

		l.forEach(System.out::println);
	}
}
