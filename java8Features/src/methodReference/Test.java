package methodReference;

public class Test {

	public static void printEven(int a) {
		if (a % 2 == 0) {
			System.out.print(a + " ");
		}

	}

	public void printOdd(int b) {
		if (b % 2 != 0) {
			System.out.print(b + " ");
		}

	}

	public static boolean checkEven(int n) {
		return n % 2 == 0;
	}

}
