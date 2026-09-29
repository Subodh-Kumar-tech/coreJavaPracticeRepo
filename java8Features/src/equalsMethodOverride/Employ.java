package equalsMethodOverride;

public class Employ {

	String name;
	int id;
	double salary;

	Employ(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String toString() {
		return "Name : " + name + "\tId : " + id + "\tSalary : " + salary;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		Employ e = (Employ) obj;

		return this.name.equals(e.name) && this.id == e.id && this.salary == e.salary;
	}

}
