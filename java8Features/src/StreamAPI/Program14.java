package StreamAPI;

public class Program14 {

	public static void main(String[] args) {

		// stream on string

		String s1 = "abcdabcced";

		s1.chars().forEach(n -> System.out.print((char) n + "\n"));

	}

}
