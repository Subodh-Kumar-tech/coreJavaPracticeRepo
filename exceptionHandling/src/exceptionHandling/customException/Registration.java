package exceptionHandling.customException;

public class Registration {

	public static void register(int age) throws UnderAgeException {
		if (age < 18) {
			throw new UnderAgeException("You are Underage so Registartion is NOT Possible!");
		} else {
			System.out.println("Registration is successfull");
		}
	}

}