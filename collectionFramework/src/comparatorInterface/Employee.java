package comparatorInterface;

public class Employee {

	String name;
	int id;
	int age;
	double salary;

	Employee() {

	}

	Employee(String name, int id, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public String toString() {
		return "Id : " + id + "\tName : " + name + "\tAge : " + age + "\tSalary : " + salary;
	}

}
