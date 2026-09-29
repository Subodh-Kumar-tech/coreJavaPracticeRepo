package wrapperClass;

public class Program1 {

	public static void main(String[] args) {

		Integer num1 = 1000;// false
		Integer num2 = 1000;// true

		System.out.println(num1 == num2);
		System.out.println(num1.equals(num2));

		System.out.println("===========================");

		Integer num3 = 100;// true
		Integer num4 = 100;// true

		System.out.println(num3 == num4);
		System.out.println(num3.equals(num4));

	}

}
