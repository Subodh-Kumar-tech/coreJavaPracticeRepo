package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program5 {

	public static void main(String[] args) {
		String s1 = "mohan sohan rohan mohan is sohan john mohan is jack rohan";

		Map<String, Integer> m = new LinkedHashMap<>();
		String temp = "";
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) != ' ') {
				temp = temp + s1.charAt(i);
			} else {
				int value = m.getOrDefault(temp, 0) + 1;
				m.put(temp, value);
				temp = "";
			}
		}
		System.out.println(m);
	}
}
