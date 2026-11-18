package set;

import java.util.Set;
import java.util.TreeSet;

public class Program3 {
	public static void main(String[] args) {

		// Set<Integer> hs1=new TreeSet<>(Comparator.reverseOrder());
		Set<Integer> hs1 = new TreeSet<>((x, y) -> y - x);
		hs1.add(44);

		hs1.add(48);
		hs1.add(51);
		hs1.add(45);

		hs1.add(44);
		hs1.add(99);
		hs1.add(83);
		hs1.add(80);
		hs1.add(115);

		System.out.println(hs1);
	}

}