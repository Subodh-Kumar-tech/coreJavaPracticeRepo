package list;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {

		// sorting using sort method by giving comparator implemetation by lambda
		// expression

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(101, "sohan", 24, 50000));
		employees.add(new Employee(102, "rohan", 28, 35000.5));
		employees.add(new Employee(104, "john", 28, 45000));
		employees.add(new Employee(105, "miller", 36, 55000));
		employees.add(new Employee(103, "mohan", 29, 35000));

		for (Employee e : employees) {
			System.out.println(e + " ");
		}

		System.out.println("====after sorting on the basis of age=====");

		employees.sort((e1, e2) -> e1.age - e2.age);
		for (Employee e : employees) {
			System.out.println(e);
		}

		System.out.println("====after sorting on the basis of id=====");

		employees.sort((e1, e2) -> e1.id - e2.id);
		for (Employee e : employees) {
			System.out.println(e);
		}

		System.out.println("====after sorting on the basis of salary=====");
//		employees.sort((e1, e2) -> (int) (e1.salary - e2.salary));
		employees.sort((e1, e2) -> e1.salary > e2.salary ? 1 : (e1.salary < e2.salary ? -1 : 0)); // using ternary
																									// operator
		for (Employee e : employees) {
			System.out.println(e);
		}

		System.out.println("====after sorting on the basis of name=====");

		employees.sort((e1, e2) -> e1.name.compareToIgnoreCase(e2.name));
		for (Employee e : employees) {
			System.out.println(e);
		}

	}

}
