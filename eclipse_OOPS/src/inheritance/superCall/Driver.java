package inheritance.superCall;

public class Driver {
	public static void main(String[] args) {
		Vehicle v1 = new Car("TATA", 3489500, 2334, 334);
		Vehicle v2 = new Bike("HONDA", 448000, "heavy", 344);
		Vehicle v3 = new Bus("Electric", 4345000, "Luxury", 344300);
		System.out.println(v1);

	}

}
