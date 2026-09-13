package encapsulation.employ;

public class Employ {

	private String name;
	private int age;
	private double salary;
	private String userId;
	private String password;

	Employ() {

	}

	Employ(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	Employ(String name, int age, double salary, String userId, String password) {
		this(name, age, salary);

		this.userId = userId;
		this.password = password;

	}

	// Setters
	public void setName(String name) {
		// validation code

		if (name.matches("[a-zA-Z ]+")) {
			this.name = name;
			return;
		}
		System.out.println("Invalid Name Entered");

	}

	public void setAge(int age) {
		// validation code
		if (age >= 18 && age <= 65) {
			this.age = age;
			return;
		}

		System.out.println("Invalid Age Entered! ");

	}

	public void setSalary(double salary) {
		// validation code
		if (salary >= 15000) {
			this.salary = salary;
			return;
		}
		System.out.println("Invalid Salary Entered!");

	}

	public void setUserId(String userId) {
		// validation code
		// String.matches gives false result always

		if (userId.matches("[//w_@#/$-&!]+")) {
			System.out.println("Invalid User Id Entered!");
			return;
		}
		this.userId = userId;

	}

	public void setPassword(String password) {
		// validation code
		if (password.length() < 8 || password.isBlank()) {
			return;
		}
		int upperCase = 0;
		int lowerCase = 0;
		int digit = 0;
		int specialChar = 0;

		for (int i = 0; i < password.length(); i++) {

			char ch = password.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {

				upperCase += 1;

			}

			else if (ch >= 'a' && ch <= 'z') {

				lowerCase += 1;

			} else if (ch >= '0' && ch <= '9') {

				digit += 1;

			} else {
				specialChar += 1;
			}
		}

		if (upperCase > 0 && lowerCase > 0 && digit > 0 && specialChar > 0) {
			this.password = password;

		}

		else {
			System.out.println("Invalid Password Entered!");
		}
	}

	// Getters

	public String getName() {
		// validation code
		return "Name : " + name;
	}

	public String getAge() {
		return "Age: " + age;
	}

	public String getSalary() {
		return "Salary: " + salary;
	}

	public String getUserId() {
		return "UserId: " + userId;
	}

	public String getPassword() {
		return "Password: " + password;
	}

}
