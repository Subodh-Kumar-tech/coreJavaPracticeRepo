package polymorphism.methodOverriding;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game g = new Game();

		TwoDShape t = g.setAndGetShape();

		t.area();

	}

}
