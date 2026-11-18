package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program2 {

	public static void main(String[] args) {

		String s1 = "aabbbcdeacca";
		Map<Character, Integer> m = new LinkedHashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			int value = m.getOrDefault(c, 0) + 1;
			m.put(c, value);
		}

		System.out.println(m);

	}

}
