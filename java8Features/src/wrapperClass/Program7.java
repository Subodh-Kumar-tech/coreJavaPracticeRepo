package wrapperClass;

public class Program7 {
	public static void main(String[] args) {

		// stored string value in Object and then use features of object and then use
		// feature after typecast it in string;

		Object o1 = "abcde";

		System.out.println((String) o1);

		String s1 = (String) o1;

		System.out.println(s1);

		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println();
		System.out.println(((String) o1).length());
		System.out.println(((String) o1).toUpperCase());

	}

}
