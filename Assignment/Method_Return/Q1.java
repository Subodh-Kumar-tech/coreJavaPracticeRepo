import java.util.Scanner;

class Q1{

	public static void main(String[] args){


		System.out.println("main starts");

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  Number");
		int a = sc.nextInt();
		
		System.out.println("Enter  number");
		int b = sc.nextInt();

		System.out.println(sum(a,b));

		System.out.println("main starts");
	}
		

	public static String sum(int a, int b){

		return "sum is : " + (a+b);
}

}