package abstraction.interface2.shapeProject;

public class Cube implements ThreeDShape {

	private double side;

	Cube(double side) {
		if (side < 0) {
			throw new RuntimeException("measurement cannot be negative");
		}
		this.side = side;
	}

	@Override
	public double volume() {

		return side * side * side;

	}

	@Override
	public double surfaceArea() {
		return 6 * (side * side);
	}

	@Override
	public double lateralSurfaceArea() {
		return 4 * (side * side);
	}

	@Override
	public void rotate() {
		System.out.println("Cube is being rotated");
	}

	@Override
	public void resize() {
		System.out.println("Cube is being resize");
	}

	public String toString() {
		return "Cube Side : " + side + "unit";
	}

}
