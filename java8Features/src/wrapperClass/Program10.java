package wrapperClass;

import java.util.ArrayList;
import java.util.List;

public class Program10 {
	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(10);
		l.add(24.28);
		l.add("Abcde");
		l.add('c');
		l.add(45);
		l.add(55);

		l.add(new Car("honda", 35000));

		System.out.println(l);

		System.out.println();

		System.out.println("Integer values are : ");
		l.stream().filter(n -> n instanceof Integer).mapToInt(n -> (int) n).forEach(n -> System.out.print(n + " "));

		System.out.println();
		System.out.println();

		int sum = l.stream().filter(n -> n instanceof Integer).mapToInt(n -> (int) n).sum();
		System.out.println("sum of Integer values present in the list : " + sum);
	}
}
