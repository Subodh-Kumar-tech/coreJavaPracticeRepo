package exceptionHandling;

public class Program7 {
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
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Index out of Bounds or Arithmetic exception occured");
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