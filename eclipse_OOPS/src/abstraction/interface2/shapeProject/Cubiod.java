package abstraction.interface2.shapeProject;

public class Cubiod implements ThreeDShape {

	private double length;
	private double width;
	private double height;

	Cubiod(double length, double width, double height) {
		if (length < 0 || width < 0 || height < 0) {
			throw new RuntimeException("measurement unit cannot be negative");
		}
		this.length = length;
		this.width = width;
		this.height = height;

	}

	@Override
	public double volume() {

		return length * width * height;

	}

	@Override
	public double surfaceArea() {
		return 2 * (length * width + width * height + height * length);
	}

	@Override
	public double lateralSurfaceArea() {
		return 2 * height * (length + width);
	}

	@Override
	public void rotate() {
		System.out.println("Cubiod is being rotated");
	}

	@Override
	public void resize() {
		System.out.println("Cubiod is being resize");
	}

	public String toString() {
		return "Cubiod Length : " + length + " Width : " + width + " Height : " + height;
	}

}
