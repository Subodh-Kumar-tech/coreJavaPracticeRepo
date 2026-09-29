package wrapperClass;

public class Program4 {
	public static void main(String[] args) {

		// unParsing : the process of converting a data into a string is called
		// unParsing;

		int x = 20;

		String s1 = Integer.toString(x);
		System.out.println(s1 + 100);
		System.out.println(s1 + 200);

		System.out.println("=========================");

		String binary = Integer.toString(x, 2);
		String octal = Integer.toString(x, 8);
		String hexadecimal = Integer.toString(x, 16);

		System.out.println(x + " in binary is : " + binary);
		System.out.println(x + " in octal is : " + octal);
		System.out.println(x + " in hexadecimal is : " + hexadecimal);

	}
}
