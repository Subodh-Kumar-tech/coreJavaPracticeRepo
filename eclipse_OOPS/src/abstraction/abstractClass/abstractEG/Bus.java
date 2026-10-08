package abstraction.abstractClass.abstractEG;

public class Bus extends FourWheeler {

	int capacity;
	int numberOfSeats;

	Bus() {

	}

	Bus(String name, double price, String color, int numberOfWheels, int capacity, int numberOfSeats) {
		super(name, price, color, numberOfWheels);
		this.capacity = capacity;
		this.numberOfSeats = numberOfSeats;
	}

	public String toString() {
		return super.toString() + "\tcapacity : " + capacity + "\tNumber of Seats : " + numberOfSeats;
	}

	public void drive() {
		System.out.println("drive the bus");
	}

	public void openDoor() {
		System.out.println("bus doors are open");
	}

	public void playMusic() {
		System.out.println("play music in bus");
	}
}
