package StreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new LinkedHashMap<>();

		map.put(101, "abc");
		map.put(102, "pqr");
		map.put(103, "stu");
		map.put(104, "pqr");
		map.put(105, "xyz");

		map.forEach((k, v) -> System.out.println(k + " " + v));

	}

}
