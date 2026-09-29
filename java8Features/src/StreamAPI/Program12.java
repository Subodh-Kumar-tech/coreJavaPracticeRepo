package StreamAPI;

import java.util.Arrays;

public class Program12 {

	public static void main(String[] args) {

		// drowwhile :- drop elements till condition matches and then print afterward.

		int[] a = { 12, 26, 18, 34, 52, 28 };

		Arrays.stream(a).dropWhile(n -> n < 40).forEach(n -> System.out.print(n + " "));

	}

}
