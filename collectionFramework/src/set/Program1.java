package set;

import java.util.HashSet;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<>();

		s1.add(10);
		s1.add(null);
		s1.add(25);
		s1.add(52);
		s1.add(115);
		s1.add(38);
		s1.add(45);

		System.out.println(s1);
	}
}
