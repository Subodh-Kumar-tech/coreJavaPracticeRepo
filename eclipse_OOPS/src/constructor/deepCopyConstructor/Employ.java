package constructor.deepCopyConstructor;

public class Employ {

	String name;
	int empId;
	Address a;

	Employ() {

	}

	Employ(String name, int empId, Address a) {
		this.name = name;
		this.empId = empId;
		this.a = a;

	}

	Employ(Employ x) {

		this.name = x.name;
		this.empId = x.empId;
		Address add = new Address(x.a.city, x.a.state, x.a.pin);
		this.a = add;

	}

	public String toString() {
		return "Name : " + name + "\tEmpId :" + empId + "\tAddress [ City : " + a.city + "\tState : " + a.state
				+ " \tPin : " + a.pin + " ]";

	}

}
