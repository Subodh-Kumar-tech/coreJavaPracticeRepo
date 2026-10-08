package abstraction.interface2.shapeProject;

public class Rectangle implements TwoDShape {

	private double length;
	private double breadth;

	Rectangle(double length, double breadth) {
		if (length < 0 || breadth < 0) {
			throw new RuntimeException("measurement cannot be negative");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		return length * breadth;
	}

	@Override
	public double perimeter() {
		return 2 * (length + breadth);
	}

	@Override
	public void rotate() {
		System.out.println("Rectangle is being rotated");
	}

	@Override
	public void resize() {
		System.out.println("Rectangle is being resize");
	}

	@Override
	public String toString() {
		return "Rectangle length :  " + length + " and breadth : 	" + breadth;
	}

}
