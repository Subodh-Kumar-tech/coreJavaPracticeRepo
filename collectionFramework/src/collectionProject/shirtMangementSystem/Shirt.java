package collectionProject.shirtMangementSystem;

public class Shirt {
	String brand;
	double price;
	int size;
	String color;

	Shirt() {

	}

	Shirt(String brand, double price, int size, String color) {
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.color = color;
	}

	public String toString() {
		return "Brand: " + brand + "\tPrice: " + price + "\tSize: " + size + "\tColor: " + color;
	}

}
