package builderPattern;

public class EmployeeDriver {
	public static void main(String[] args) {

		Employee e1 = new Employee.Builder().setName("mohan").setId(101).setAge(24).setSalary(35000).setAddress("noida")
				.build();

		System.out.println(e1);
	}
}
