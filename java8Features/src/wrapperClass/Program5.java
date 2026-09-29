package wrapperClass;

public class Program5 {
	public static void main(String[] args) {

		// Parsing : converting string type data into its original type is called
		// parsing.

		String s1 = "356";

		int a = Integer.parseInt(s1);
		Integer b = Integer.valueOf(s1);

		System.out.println(s1);
		System.out.println(a);
		System.out.println(b);

		System.out.println("===========================");

		String s2 = "45.64";

		double c = Double.parseDouble(s2);
		Double d = Double.valueOf(s2);

		System.out.println(s2);
		System.out.println(c);
		System.out.println(d);

		System.out.println("============================");

		String s3 = "100011";

		int e = Integer.parseInt(s3, 2); // to binary number
		System.out.println(e);
		System.out.println("====================================");

		int f = Integer.parseInt(s3, 8); // to octal number
		System.out.println(f);
		System.out.println("==============================");

		int g = Integer.parseInt(s3, 16); // to hexadecimal number
		System.out.println(g);
		System.out.println("===============================");

		String s4 = "1ab3";
		int h = Integer.parseInt(s4, 16);
		System.out.println(h);
		System.out.println("============================");

		System.out.println("====================");

	}
}
