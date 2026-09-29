package wrapperClass;

import java.util.ArrayList;
import java.util.List;

public class Program11 {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(45);
		l.add(52);
		l.add(26);
		l.add(48);
		l.add(50);

		int sum = l.stream().mapToInt(n -> n).sum();
		System.out.println("sum of all values : " + sum);

		System.out.println();

		int count = (int) l.stream().map(n -> n.intValue()).filter(n -> n % 2 == 0).count();
		System.out.println("count of all even values present in list : " + count);

	}
}
