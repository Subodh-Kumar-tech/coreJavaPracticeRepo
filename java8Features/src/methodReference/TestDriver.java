package methodReference;

import java.util.ArrayList;
import java.util.List;

public class TestDriver {
	public static void main(String[] args) {

		// method reference : method reference is simplified way to call a method while
		// working with lambda expression and stream api.

		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(25);
		l.add(44);
		l.add(55);
		l.add(35);

		l.forEach(Test::printEven);

		System.out.println();

		Test t1 = new Test();

		l.forEach(t1::printOdd);
//		System.out.println();
//		l.forEach(new Test()::printOdd);

		System.out.println("==============================");

		long count = l.stream().map(Integer::intValue).filter(Test::checkEven).count();

		System.out.println(count);

	}

}
