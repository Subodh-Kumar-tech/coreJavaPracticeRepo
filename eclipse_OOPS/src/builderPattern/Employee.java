package builderPattern;

public class Employee {

	String name;
	int id;
	int age;
	double salary;
	String address;

	private Employee() {

	}

	private Employee(String name, int id, int age, double salary, String address) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	private Employee(Builder b) {
		this(b.name, b.id, b.age, b.salary, b.address);
	}

	public String toString() {
		return "Name : " + name + "\tId : " + id + "\tAge : " + age + "\tSalary : " + salary + "\tAddress : " + address;
	}

	static class Builder {
		String name;
		int id;
		int age;
		double salary;
		String address;

		public Employee build() {
			return new Employee(this);
		}

		public String toString() {
			return "Name : " + name + "\tId : " + id + "\tAge : " + age + "\tSalary : " + salary + "\tAddress : "
					+ address;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setId(int id) {
			this.id = id;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

	}

}
