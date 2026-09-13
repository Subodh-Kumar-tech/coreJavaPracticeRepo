package constructor.copyConstructor;

public class EmployDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Employ e1 = new Employ();
		Employ e2 = new Employ("mohan", 23344, new Address("noida", "UP", 233444));
		Employ e3 = new Employ("Rohan", 34454, new Address("Kanpur", "UP", 445456));
		Employ e4 = new Employ(e2);

//		e4.a.city = "Lucknow";

		System.out.println(e2);

		System.out.println(e3);
		System.out.println(e4);

	}

}
