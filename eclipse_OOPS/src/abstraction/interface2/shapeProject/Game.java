package abstraction.interface2.shapeProject;

public class Game {

	public void start() {
		System.out.println("welcome to the game! lets start the game");

		System.out.println("press 1 to choose TwoDShape");
		System.out.println("press 2 to choose ThreeDShape");

		int choice = Integer.parseInt(IO.readln("enter your choice : "));

		if (choice == 1) {
			System.out.println("you have selected TwoDShape");
			try {
				TwoDShape t = selectAndGetTwoDShape();
				String shape = t.getClass().getSimpleName();
				System.out.println(t);
				System.out.println("Area of " + shape + " : " + t.area());
				System.out.println("Perimeter of " + shape + " : " + t.perimeter());
				t.rotate();
				t.resize();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} else if (choice == 2) {
			System.out.println("you have selected ThreeDShape");
			try {
				ThreeDShape th = selectAndGetThreeDShape();
				System.out.println(th);
				String shape = th.getClass().getSimpleName();
				System.out.println("Volume of " + shape + " : " + th.volume());
				System.out.println("surfaceArea of " + shape + " : " + th.surfaceArea());
				System.out.println("lateralSurfaceArea of " + shape + " : " + th.lateralSurfaceArea());
				th.rotate();
				th.resize();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("Invalid choice");
			start();
		}
	}

	public static TwoDShape selectAndGetTwoDShape() {

		System.out.println("press 1 for circle");
		System.out.println("press 2 for rectangle");
		System.out.println("press 3 for square");

		int choice = Integer.parseInt(IO.readln("enter you choice : "));

		if (choice == 1) {
			System.out.println("you have selected circle");
			double radius = Double.parseDouble(IO.readln("Enter the radius of circle : "));
			Circle c = new Circle(radius);

			return c;
		} else if (choice == 2) {
			System.out.println("you have selected rectangle");
			double length = Double.parseDouble(IO.readln("enter the length of rectangle : "));
			double breadth = Double.parseDouble(IO.readln("enter the breadth of rectangle : "));

			Rectangle r = new Rectangle(length, breadth);

			return r;

		} else if (choice == 3) {
			System.out.println("you have selected square");
			double side = Double.parseDouble(IO.readln("enter the side of squae : "));
			Square s = new Square(side);

			return s;
		} else {
			System.out.println("invalid choice");
			return selectAndGetTwoDShape();
		}

	}

	public static ThreeDShape selectAndGetThreeDShape() {
		System.out.println("press 1 for cube");
		System.out.println("press 2 for cubiod");
		System.out.println("press 3 for Cylinder");

		int choice = Integer.parseInt(IO.readln("enter your choice : "));

		if (choice == 1) {
			System.out.println("you have selected cube");
			double side = Double.parseDouble(IO.readln("enter the side of cube : "));
			Cube c = new Cube(side);
			return c;

		} else if (choice == 2) {
			System.out.println("you have selected cubiod");
			double length = Double.parseDouble(IO.readln("enter the length of cubiod : "));
			double width = Double.parseDouble(IO.readln("enter the widht of cubiod : "));
			double height = Double.parseDouble(IO.readln("enter the height of cubiod"));

			Cubiod c = new Cubiod(length, width, height);

			return c;
		} else if (choice == 3) {
			System.out.println("you have selected cylider");

			double radius = Double.parseDouble(IO.readln("enter the radius of cylinder : "));
			double height = Double.parseDouble(IO.readln("enter the height of cylinder : "));

			Cylinder c = new Cylinder(radius, height);

			return c;
		} else {
			System.out.println("invalid choice");
			return selectAndGetThreeDShape();

		}
	}

	public boolean doYouWantToContinue() {
		String choice = IO.readln("press yes to coninue or no to exit : ");
		return choice.equalsIgnoreCase("yes");
	}

}
