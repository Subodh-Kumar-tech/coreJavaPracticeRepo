package inheritance.superCall;

public class Bike extends Vehicle {

	String engineType;

	int cc;

	Bike() {

	}

	Bike(String brand, int price, String engineType, int cc) {

//		super.brand = brand;
//		super.price = price;
		super(brand, price);
		this.engineType = engineType;
		this.cc = cc;

	}
}
