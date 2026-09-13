package inheritance.gameProject;

public class Bus extends Vehicle {

	String busTpe;
	int capacity;

	Bus() {

	}

	Bus(String brand, int price, String busType, int capacity) {
//		super.brand = brand;
//		super.price = price;
		super(brand, price);
		this.busTpe = busType;
		this.capacity = capacity;

	}
}
