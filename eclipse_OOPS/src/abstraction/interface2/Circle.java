package abstraction.interface2;

public class Circle implements TwoDShape {
	private double r;

	Circle(double r) {
		if (r < 0) {
			throw new RuntimeException("Radius cannot be negative");
		}
		this.r = r;
	}

	@Override
	public double area() {
		return Math.PI * r * r;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * r;
	}

	@Override
	public void rotate() {
		System.out.println("circle is being rotated");
	}

	@Override
	public void resize() {
		System.out.println("circle is being resize");
	}

	@Override
	public String toString() {
		return "Circle radius " + r + "unit";
	}

}
