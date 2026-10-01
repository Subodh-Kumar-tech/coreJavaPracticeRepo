package TimeAndDateApi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employ {

	String name;
	int age;
	double salary;
	LocalDateTime joiningDate;
	LocalDate dob;

	Employ() {

	}

	Employ(String name, int age, double salary, LocalDateTime joiningDate, LocalDate dob) {

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.dob = dob;

	}

	public String toString() {
		return "Name is : " + name + "\tAge : " + "\tSalary : " + salary + "\tJoiningDate is : " + joiningDate.getYear()
				+ ":" + joiningDate.getMonth().name().substring(0, 3) + ":" + joiningDate.getDayOfMonth() + "\tDob : "
				+ dob.getYear() + ":" + dob.getMonthValue() + ":" + dob.getDayOfMonth();

	}

}
