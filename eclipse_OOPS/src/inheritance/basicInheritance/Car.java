package inheritance.basicInheritance;

public class Car extends Vehicle {

	int hp;
	int stroke;

	Car() {

	}

	Car(String name, String color, double salary, int hp, int stroke) {
		super.name = name;
		super.color = color;
		super.price = price;
		this.hp = hp;
		this.stroke = stroke;
	}

	public String toString() {

		return super.toString() + "\tHP : " + hp + "\t Stroke : " + stroke;

	}
}
