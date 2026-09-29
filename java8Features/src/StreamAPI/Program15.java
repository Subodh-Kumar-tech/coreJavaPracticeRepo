package StreamAPI;

public class Program15 {

	public static void main(String[] args) {

		String s1 = "abcdabcced";

		// unique char

		s1.chars().distinct().forEach(n -> System.out.print((char) n + " "));

		System.out.println();

		// char in sorted order
		s1.chars().sorted().forEach(n -> System.out.print((char) n + " "));

	}

}
