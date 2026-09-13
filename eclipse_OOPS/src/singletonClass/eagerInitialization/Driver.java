package singletonClass.eagerInitialization;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employ e1 = Employ.getInstance();

		e1.getDocument("Adhar card");
		e1.getDocument("pan card");

		Employ e2 = Employ.getInstance();
		Employ e3 = Employ.getInstance();

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}
