package inheritance.gameProject;

public class Car extends Vehicle {

	int hp;
	int stroke;

	Car() {

	}

	Car(String brand, int price, int hp, int stroke) {

//		super.brand = brand;
//		super.price = price;
		super(brand, price);
		this.hp = hp;
		this.stroke = stroke;

	}

}
