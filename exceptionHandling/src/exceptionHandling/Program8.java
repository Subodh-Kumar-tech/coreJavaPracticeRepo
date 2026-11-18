package exceptionHandling;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n1 = Integer.parseInt(IO.readln("Enter the 1st Number: "));
			int n2 = Integer.parseInt(IO.readln("Enter the 2nd Number: "));
			System.out.println(n1 + "+" + n2 + "= " + (n1 + n2));
			System.out.println(n1 + "-" + n2 + "= " + (n1 - n2));
			try {
				System.out.println(n1 + "/" + n2 + "= " + (n1 / n2));
			} catch (ArithmeticException e) {
				System.out.println(n1 + "/" + n2 + "= Infinity");
			}
			System.out.println(n1 + "*" + n2 + "= " + (n1 * n2));
		} catch (NumberFormatException e) {
			System.out.println("Provide input format is Invalid!");
		} catch (Exception e) {
			System.out.println("Other exception caught");
		} finally {
			System.out.println("This is finally block");
			sc.close();
		}

		System.out.println("Program Ends!");
	}

}