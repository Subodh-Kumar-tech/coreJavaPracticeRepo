package wrapperClass;

public class Program8 {
	public static void main(String[] args) {

		Object o1 = 520;

		System.out.println(o1);
		System.out.println((Integer) o1 + 100);

		System.out.println();

		Integer a = (Integer) o1;

		System.out.println(a.byteValue());
		System.out.println(a.intValue());
	}
}
