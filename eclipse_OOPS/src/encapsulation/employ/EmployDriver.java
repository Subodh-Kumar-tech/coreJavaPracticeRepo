package encapsulation.employ;

public class EmployDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employ e1 = new Employ("mohan", 24, 240000);

		e1.setName("Mohan Kumar");
		e1.setAge(28);
		e1.setSalary(45000);
		e1.setUserId("mohan@435");
		e1.setPassword("Mohan@12355847");
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getUserId());
		System.out.println(e1.getPassword());

	}

}
