package exceptionHandling.customException;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Application starts");
		int age = Integer.parseInt(IO.readln("Enter age: "));
		try {
			Registration.register(age);
			String name = IO.readln("Enter Name: ");
			long mobNo = Long.parseLong(IO.readln("ENter the Mobile Number: "));
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("======Application ends=======");

	}

}