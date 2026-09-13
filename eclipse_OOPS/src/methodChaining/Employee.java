package methodChaining;

public class Employee {
	private String name;
	private int age;

	public Employee setName(String name) {
		this.name = name;
		return this;

	}

	public Employee setAge(int age) {
		this.age = age;
		return this;
	}

	public Employee display() {
		System.out.println("Name : " + name + "\tAge : " + age);
		return this;
	}

}
