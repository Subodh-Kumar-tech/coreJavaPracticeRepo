package polymorphism.methodOverriding.usingInstanceOf;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game g = new Game();

		TwoDShape t = g.setAndGetShape();

		if (t instanceof Circle) {
			System.out.println("Circle recieved");

			((Circle) t).area();
		} else if (t instanceof Rectangle) {
			System.out.println("Rectangle recieved");

			((Rectangle) t).area();
		} else if (t instanceof Square s) {
			System.out.println("Square recieved");
			s.area();
		} else {
			System.out.println("Invalid Shape");
		}

	}

}
