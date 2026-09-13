import java.util.Scanner;


class Program1{

	public static void main(String[] args){

	System.out.println("Program starts ============================");	
	System.out.println();
	

	Scanner sc = new Scanner(System.in);
	//int age = sc.nextInt();
	
	//sc.nextLine();
	
	//String name = sc.nextLine();
	
	System.out.print("Enter your age : ");
	int age = Integer.parseInt(sc.nextLine());
	
	System.out.print("Enter your name : ");
	String name = sc.nextLine();
	
	System.out.print("Enter your address : ");
	String address = sc.nextLine();
	
	System.out.print("Enter your salary : ");
	double salary = Double.parseDouble(sc.nextLine());
	
	System.out.print("Enter a String value : ");
	char ch = sc.nextLine().charAt(2);

	System.out.print("Enter your first name : ");
	String firstName = sc.next();

	System.out.println();
	System.out.println("name : " + name);
	System.out.println("age : " + age);
	System.out.println("salary : " + salary);
	System.out.println("address : " + address);
	System.out.println("char : " + ch);
	System.out.println("first Name : " + firstName);




	System.out.println();
	System.out.println("Program ends ============================");	

	}


}
