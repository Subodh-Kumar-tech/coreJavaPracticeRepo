package exceptionHandling;

public class Program5 {
	public static void main(String[] args) {
		int[] a = { 12, 16, 20, 0, 120, 200 };
		try {
			int indx1 = Integer.parseInt(IO.readln("Enter the Index1: "));
			int indx2 = Integer.parseInt(IO.readln("Enter the Index2: "));

			int res = a[indx1] / a[indx2];
			System.out.println("Result is: " + res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Program Ends!");

	}

}