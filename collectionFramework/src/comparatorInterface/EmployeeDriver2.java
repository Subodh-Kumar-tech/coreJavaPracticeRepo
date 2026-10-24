package comparatorInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeDriver2 {
	public static void main(String[] args) {

		List<Employee> l1 = new ArrayList<>();

		l1.add(new Employee("rohan", 101, 24, 35000));
		l1.add(new Employee("john", 102, 28, 45000));
		l1.add(new Employee("miller", 105, 35, 45000));
		l1.add(new Employee("rohan", 104, 24, 15000));
		l1.add(new Employee("sohan", 103, 24, 35000));

		for (Employee e : l1) {
			System.out.println(e);
		}
		System.out.println();

		System.out.println("===========sorting on the basis of id=========");
		l1.sort(Comparator.comparingInt((e) -> e.id));
		for (Employee e : l1) {
			System.out.println(e);
		}
		System.out.println();

		System.out.println("===========sorting on the basis of age=========");
		l1.sort(Comparator.comparingInt((e) -> e.age));
		for (Employee e : l1) {
			System.out.println(e);
		}
		System.out.println();

		System.out.println("===========sorting on the basis of salary=========");
		l1.sort(Comparator.comparingDouble((e) -> e.salary));
		for (Employee e : l1) {
			System.out.println(e);
		}
		System.out.println();

		System.out.println("===========sorting on the basis of name=========");
		l1.sort(Comparator.comparing((e) -> e.name));
		for (Employee e : l1) {
			System.out.println(e);
		}
		System.out.println();

		System.out.println(
				"===========sorting on the basis of id but if id same then age then salary then name=========");
		l1.sort(Comparator.comparingInt((Employee e) -> e.id).thenComparingInt((e) -> e.age)
				.thenComparingDouble((e) -> e.salary).thenComparing((e) -> e.name));
		for (Employee e : l1) {
			System.out.println(e);
		}
		System.out.println();

	}

}
