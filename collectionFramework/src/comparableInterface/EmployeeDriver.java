package comparableInterface;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeDriver {
	public static void main(String[] args) {

		Set<Employee> l1 = new TreeSet<>();

		l1.add(new Employee("mohan", 101, 24, 35000));
		l1.add(new Employee("rohan", 103, 24, 35000));
		l1.add(new Employee("john", 104, 28, 45000));
		l1.add(new Employee("miller", 105, 35, 45000));
		l1.add(new Employee("sohan", 102, 25, 45000));

		for (Employee n : l1) {
			System.out.println(n);
		}

	}
}
