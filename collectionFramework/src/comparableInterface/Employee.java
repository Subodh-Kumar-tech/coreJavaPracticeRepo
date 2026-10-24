package comparableInterface;

public class Employee implements Comparable<Employee> {

	String name;
	int id;
	int age;
	double salary;

	Employee() {

	}

	Employee(String name, int id, int age, double salary) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
	}

	public String toString() {

		return "Name : " + name + "\tid : " + id + "\tage : " + age + "\tsalary : " + salary;
	}

//	@Override
//	public int compareTo(Employee e) {
//
	//// return this.id - e.id; / return this.age - e.age;

//		return Double.compare(this.salary, e.salary);
	//// return this.name.compareTo(e.name);
//	}

	@Override
	public int compareTo(Employee e) {

		if (this.age == e.age) {
			if (this.salary == e.salary) {
				return this.name.compareTo(e.name);
			}
			return Double.compare(this.salary, e.salary);
		}
		return Integer.compare(this.age, e.age);

	}

}
