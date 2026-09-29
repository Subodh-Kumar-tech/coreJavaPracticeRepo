package wrapperClass;

public class Program12 {
	public static void main(String[] args) {

		char c1 = 'E';
		char c2 = 't';
		char c3 = '5';
		char c4 = '@';

		System.out.println(Character.isUpperCase(c1)); // true
		System.out.println(Character.isLowerCase(c2)); // true
		System.out.println(Character.isDigit(c3)); // true
		System.out.println(Character.isAlphabetic(c4)); // false
	}
}
