package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program6 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(15);
		l.add(28);
		l.add(34);
		l.add(14);
		l.add(26);

//		List<Integer> l2 = l.stream().sorted().collect(Collectors.toList());
		l = l.stream().sorted().collect(Collectors.toList());

		System.out.println(l);
//		System.out.println(l2);
	}

}
