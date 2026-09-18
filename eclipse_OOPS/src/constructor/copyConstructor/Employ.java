package constructor.copyConstructor;

public class Employ {

	String name;
	int age;
	double salary;

	Employ() {

	}

	Employ(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	Employ(Employ x) {
//		this(x.name,x.age,x.salary);
		this.name = x.name;
		this.age = x.age;
		this.salary = x.salary;
	}

	public String toString() {
		return "Name : " + name + "\tAge : " + age + "\tSalary : " + salary;
	}

}
