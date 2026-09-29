package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<>();

		l.add(12);
		l.add(35);
		l.add(26);
		l.add(42);
		l.add(14);

		int sumResult = (int) l.stream().mapToInt(n -> n).sum();

		System.out.println(sumResult);

	}

}
