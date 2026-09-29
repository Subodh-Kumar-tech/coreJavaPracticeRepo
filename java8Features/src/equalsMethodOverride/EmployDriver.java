package equalsMethodOverride;

public class EmployDriver {

	public static void main(String[] args) {

		Employ e1 = new Employ("mohan", 101, 28000);
		Employ e2 = new Employ("sohan", 102, 32000);
		Employ e3 = new Employ("mohan", 101, 28000);

		System.out.println("===========toString()==============");

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		System.out.println("============equals()===============");

		System.out.println(e1 == e2);
		System.out.println(e1 == e3);

		System.out.println("============================");

		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));

		System.out.println("================hashcode()===============");

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());

	}

}
