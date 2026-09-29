package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<>();

		l.add(12);
		l.add(24);
		l.add(35);
		l.add(42);
		l.add(26);

		int countResult = (int) l.stream().distinct().count();

		System.out.println(countResult);
	}

}
