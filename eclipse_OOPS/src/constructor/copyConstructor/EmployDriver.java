package constructor.copyConstructor;

public class EmployDriver {

	public static void main(String[] args) {

		Employ e1 = new Employ("mohan", 24, 26000);
		Employ e2 = new Employ("sohan", 26, 35000);
		Employ e3 = new Employ(e1);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}
