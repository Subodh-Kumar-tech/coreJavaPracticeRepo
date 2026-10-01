package project.dominosProject;

public class Domino {

	static {
		System.out.println("===Hlo.. Namste Sir ... welcome to the Domino===");
	}

	public FastFood orderFood() {

		System.out.println("order food");
		System.out.println("press 1 for pizza");
		System.out.println("press 2 for Burger");
		System.out.println("press 3 for Lavacake");
		System.out.println("press 4 for FrenchFries");

		int choice = Integer.parseInt(IO.readln("Enter you choice to order food"));

		switch (choice) {

		case 1:
			return new Pizza();
		case 2:
			return new Burger();
		case 3:
			return new Lavacake();
		case 4:
			return new FrenchFries();
		default:
			return orderFood();

		}
	}
}
