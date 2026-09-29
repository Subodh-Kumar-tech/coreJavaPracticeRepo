package StreamAPI;

import java.util.Arrays;

public class Program13 {

	public static void main(String[] args) {

		// takewhile :- print element till condition matches.

		int[] a = { 12, 32, 34, 42, 28, 16, 34, 52, 26 };

		Arrays.stream(a).takeWhile(n -> n < 40).forEach(n -> System.out.print(n + " "));

	}

}
