package abstraction.abstractClass.abstractEG;

public abstract class FourWheeler extends Vehicle {

	int numberOfWheels;

	FourWheeler() {

	}

	FourWheeler(String name, double price, String color, int numberOfWheels) {
		super(name, price, color);
		this.numberOfWheels = numberOfWheels;
	}

	public String toString() {
		return super.toString() + "\tNumber of Wheels : " + numberOfWheels;
	}

	public abstract void openDoor();

}
