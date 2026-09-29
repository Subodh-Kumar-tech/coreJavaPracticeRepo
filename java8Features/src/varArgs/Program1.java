package varArgs;

public class Program1 {

	public static void main(String[] args) {

		// var args :- variable argument;

		int a = 10;
		int b = 18;
		int c = 24;

		add(a, b, c);

	}

	public static void add(int... a) {
		int sum = 0;
		for (int n : a) {
			sum += n;
		}
		System.out.println(sum);
	}

}
