//package exceptionHandling;
//
//public class Program1 {
//
//	public static void main(String[] args) {
//
//		try {
//			int[] a = { 41, 35, 73, 15, 55 };
//
//			int n = getFirstEvenValue(a);
//			System.out.println(n);
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("program ends!");
//	}
//
//	public static int getFirstEvenValue(int[] a) {
//		for (int n : a) {
//			if (n % 2 == 0) {
//				return n;
//			}
//		}
//		throw new RuntimeException("no such element present");
//	}
//
//}

package exceptionHandling;

public class Program1 {
	public static void main(String[] args) {
		int[] a = { 15, 23, 41, 35, 27, 11 };
		try {
			int res = getFirstEvenNumber(a);
			int finalResult = res * 2 + 15;
			System.out.println(finalResult);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		System.out.println("Program Successfully Ends!");
	}

	public static int getFirstEvenNumber(int[] a) {
		for (int n : a) {
			if (n % 2 == 0)
				return n;
		}
		throw new RuntimeException("No Such Element Found");
	}

}