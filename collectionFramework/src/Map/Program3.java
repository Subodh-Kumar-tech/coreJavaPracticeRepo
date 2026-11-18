package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program3 {

	public static void main(String[] args) {

		Map<Integer, Integer> m = new LinkedHashMap<>();

		m.put(12, 2);
		m.put(10, 5);
		m.put(15, 4);
		m.put(11, 8);
		m.put(13, 2);

		int n = Integer.parseInt(IO.readln("enter your input : "));
		int value = m.getOrDefault(n, 0) + 1;

		m.put(n, value);

		System.out.println(m);

	}
}
