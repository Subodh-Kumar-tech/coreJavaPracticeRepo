package abstraction.abstractClass.abstractEG;

public class Driver {

	public static void main(String[] args) {

		FourWheeler fw1 = new Car("TATA", 250000, "yellow", 4, 25, 5000);

		System.out.println(fw1);
		fw1.drive();
		fw1.openDoor();
	}

}
