package abstraction.abstractClass.abstractEG;

public class Car extends FourWheeler {

	int hp;
	int stroke;

	Car() {

	}

	Car(String name, double price, String color, int numberOfWheels, int hp, int stroke) {
		super(name, price, color, numberOfWheels);
		this.hp = hp;
		this.stroke = stroke;
	}

	public String toString() {
		return super.toString() + "\tHorse Power : " + hp + "\tStroke : " + stroke;
	}

	@Override
	public void drive() {
		System.out.println("drive the car ");
	}

	@Override
	public void openDoor() {
		System.out.println("car doors are open");
	}

	public void playMusic() {
		System.out.println("play music in car");
	}

}
