package wrapperClass;

public class Program2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;

		int res1 = Integer.compare(x, y);

		System.out.println(res1);

		Integer p = 50;
		Integer q = 50;

		int res2 = p.compareTo(q);
		System.out.println(res2);

	}
}
