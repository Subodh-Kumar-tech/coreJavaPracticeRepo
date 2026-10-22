package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program4 {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(103, "mohan", 28, 35000));
		employees.add(new Employee(101, "sohan", 24, 50000));
		employees.add(new Employee(104, "john", 28, 35000));
		employees.add(new Employee(105, "miller", 36, 55000));

		employees.add(new Employee(102, "rohan", 29, 45000.5));

		for (Employee e : employees) {
			System.out.println(e + " ");
		}

		System.out.println();

		System.out.println("============sorting employee on the basis of id===========");
		employees.sort(Comparator.comparingInt((Employee e) -> e.id));
		for (Employee e : employees) {
			System.out.println(e);
		}

		System.out.println("============sorting employee on the basis of age===========");
		employees.sort(Comparator.comparingInt((Employee e) -> e.age));
		for (Employee e : employees) {
			System.out.println(e);
		}

		System.out.println("============sorting employee on the basis of salary===========");
		employees.sort(Comparator.comparingDouble((Employee e) -> e.salary));
		for (Employee e : employees) {
			System.out.println(e);
		}

		System.out.println("============sorting employee on the basis of name===========");
		employees.sort(Comparator.comparing((Employee e) -> e.name));
		for (Employee e : employees) {
			System.out.println(e);
		}

		System.out.println(
				"============sorting employee on the basis of age and if age is same then on the basis of salary===========");
		employees.sort(Comparator.comparingDouble((Employee e) -> e.age).thenComparingDouble((e) -> e.salary));
		for (Employee e : employees) {
			System.out.println(e);
		}

		System.out.println(
				"============sorting employee on the basis of age and if age is same then on the basis of salary and if salary also same then on the basis of name===========");
		employees.sort(Comparator.comparingDouble((Employee e) -> e.age).thenComparingDouble((e) -> e.salary)
				.thenComparing((e) -> e.name));
		for (Employee e : employees) {
			System.out.println(e);
		}

	}

}
