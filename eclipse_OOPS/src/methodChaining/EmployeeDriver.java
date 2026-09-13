package methodChaining;

public class EmployeeDriver {

	public static void main(String[] args) {

		// method chaining
		// Builder Pattern

		Employee e1 = new Employee();

		e1.setName("Mohan").setAge(24).display();

	}

}
