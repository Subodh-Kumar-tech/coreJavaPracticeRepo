package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program4 {
	public static void main(String[] args) {
		String s1 = "mohan sohan rohan mohan is sohan john mohan is jack rohan";
		Map<Character, Integer> m = new LinkedHashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			int val = m.getOrDefault(c, 0) + 1;
			m.put(c, val);
		}
		System.out.println(m);
	}
}
