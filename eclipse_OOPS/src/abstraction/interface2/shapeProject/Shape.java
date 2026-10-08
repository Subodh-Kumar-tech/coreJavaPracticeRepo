package abstraction.interface2.shapeProject;

public interface Shape {

	int DIMENSION = 5; // public static final DIMENSION = 5;

	void rotate();

	void resize();

	default void zoomIn() {
		System.out.println("click to zoom in ");
	}

	private void click() {
		System.out.println("click on shape");
	}

	private static void compress() {
		System.out.println("compress shape");
	}

}
