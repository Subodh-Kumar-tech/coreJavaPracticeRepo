package project.ecomApp;

public class Order {

	static {
		System.out.println("===welcome back====");

	}

	public Product buy() {
		System.out.println("select your product and add to cart to buy");

		System.out.println("enter 1 for shirt");
		System.out.println("enter 2 for mobile");
		System.out.println("enter 3 for laptop");
		System.out.println("enter 4 for lights");

		int choice = Integer.parseInt(IO.readln("enter your choice for products : "));

		switch (choice) {

		case 1:
			return new Shirt();
		case 2:
			return new Mobile();
		case 3:
			return new Laptop();
		case 4:
			return new Lights();
		default:
			return buy();

		}

	}

}
