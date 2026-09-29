package objectClass;

import java.util.Objects;

public class Employ implements Cloneable {

	public String name;
	public int id;
	public double salary;

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
		return this.name.equalsIgnoreCase(e.name) && this.id == e.id && this.salary == e.salary;

	}

	public int hashcode() {
		return Objects.hash(name, id, salary);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
