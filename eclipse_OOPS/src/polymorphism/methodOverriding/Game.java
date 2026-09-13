package polymorphism.methodOverriding;

public class Game {

	{
		System.out.println("===Welcome to the game===");
	}

	public TwoDShape setAndGetShape() {
		System.out.println("Press 1 for circle");
		System.out.println("Press 2 for rectangle");
		System.out.println("Press 3 for square");

		int choice = Integer.parseInt(IO.readln("Enter Your Choice : "));

		switch (choice) {
		case 1:
			System.out.println("You have selected Circle");
			Circle c = new Circle();
			return c;
		case 2:
			System.out.println("You have selected rectangle ");
			Rectangle r = new Rectangle();
			return r;

		case 3:
			System.out.println("You have selected square");
			Square s = new Square();
			return s;
		default:
			System.out.println("Invalid Choice ");
			return setAndGetShape();

		}
	}

}
