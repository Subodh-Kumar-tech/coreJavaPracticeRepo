package comparatorInterface;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDriver {

	public static void main(String[] args) {

		List<Employee> l1 = new ArrayList<>();

		l1.add(new Employee("rohan", 101, 24, 35000));
		l1.add(new Employee("john", 102, 28, 45000));
		l1.add(new Employee("miller", 105, 35, 45000));
		l1.add(new Employee("rohan", 102, 24, 15000));
		l1.add(new Employee("sohan", 103, 24, 35000));

		for (Employee e : l1) {
			System.out.println(e);
		}
		System.out.println();

		System.out.println("=========sorting on the basis of id===========");
		l1.sort((e1, e2) -> e1.id - e2.id);

		for (Employee e : l1) {
			System.out.println(e);
		}

		System.out.println();
		System.out.println("=========sorting on the basis of age===========");
		l1.sort((e1, e2) -> e1.age - e2.age);

		for (Employee e : l1) {
			System.out.println(e);
		}

		System.out.println();
		System.out.println("=========sorting on the basis of salary===========");
		l1.sort((e1, e2) -> e1.salary > e2.salary ? 1 : e1.salary < e2.salary ? -1 : 0);

		for (Employee e : l1) {
			System.out.println(e);
		}

		System.out.println();
		System.out.println("=========sorting on the basis of name===========");
		l1.sort((e1, e2) -> e1.name.compareTo(e2.name));

		for (Employee e : l1) {
			System.out.println(e);
		}

	}

}
