package wrapperClass;

public class Test {

	public static void process(Object o) {
		System.out.println("process starts and value is : [ " + o + " ]");

		if (o instanceof String s) {
			System.out.println("String " + s + " in UpperCase is : " + s.toUpperCase());
			System.out.println("String " + s + " length is : " + s.length());
		} else if (o instanceof Integer a) {
			System.out.println("Integer " + a + " Byte value is : " + a.byteValue());
		}

	}
}
