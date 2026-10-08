package abstraction.interface2.shapeProject;

public class Square implements TwoDShape {

	private double side;

	Square(double side) {
		if (side < 0) {
			throw new RuntimeException("measurement cannot be negative");
		}
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}

	@Override
	public double perimeter() {
		return 4 * side;
	}

	@Override
	public void rotate() {
		System.out.println("Square is being rotated");
	}

	@Override
	public void resize() {
		System.out.println("Square is being resize");
	}

	@Override
	public String toString() {
		return "Square side : " + side + "unit";
	}

}
