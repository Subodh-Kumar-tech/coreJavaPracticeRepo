package abstraction.interface2.shapeProject;

public class Cylinder implements ThreeDShape {

	private double radius;
	private double height;

	Cylinder(double radius, double height) {
		if (radius < 0 || height < 0) {
			throw new RuntimeException("measurement cannot be negative");
		}
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double volume() {

		return Math.PI * radius * radius * height;

	}

	@Override
	public double surfaceArea() {
		return 2 * Math.PI * radius * (radius + height);
	}

	@Override
	public double lateralSurfaceArea() {
		return 2 * Math.PI * radius * height;
	}

	@Override
	public void rotate() {
		System.out.println("Cylinder is being rotated");
	}

	@Override
	public void resize() {
		System.out.println("Cylinder is being resize");
	}

	public String toString() {
		return "Cylinder radius : " + radius + " height : " + height;
	}

}
