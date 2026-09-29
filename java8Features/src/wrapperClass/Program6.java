package wrapperClass;

public class Program6 {
	public static void main(String[] args) {
		// 0 for octal;
		// 0b for binary;
		// 0x for hexadecimal;

		int s = 0b100011; // binary number
		System.out.println(s);
		System.out.println("========================");

		int t = 0100011;
		System.out.println(t); // octal number
		System.out.println("==========================");

		int p = 0x100011; // hexadecimal number
		System.out.println(p);

	}
}
