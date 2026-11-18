package exceptionHandling;

public class Program6 {
	public static void main(String[] args) {
		int[] a = { 12, 16, 20, 0, 120, 200 };
		try {
			int indx1 = Integer.parseInt(IO.readln("Enter the Index1: "));
			int indx2 = Integer.parseInt(IO.readln("Enter the Index2: "));

			int res = a[indx1] / a[indx2];
			System.out.println("Result is: " + res);
		} catch (NumberFormatException e) {
			System.out.println("The given input format is invalid");
			System.out.println(e);
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Result is Infinity");
			System.out.println(e);
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The given index is out of range");
			System.out.println(e);
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Other type exception is caught");
			System.out.println(e);
			System.out.println(e.getMessage());
		}

		System.out.println("Program Ends!");

	}

}