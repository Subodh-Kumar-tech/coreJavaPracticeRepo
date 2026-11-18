package exceptionHandling;

public class Program13 {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} finally {
			System.out.println("abc".charAt(9));
		}
	}

}