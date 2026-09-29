package StreamAPI;

import java.util.Arrays;

public class Program11 {

	public static void main(String[] args) {

		// stream on array

		int[] a = { 12, 35, 24, 46, 52, 18, 28, 35 };

		a = Arrays.stream(a).distinct().toArray();

		for (int n : a) {
			System.out.print(n + " ");
		}

	}

}
