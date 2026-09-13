package inheritance.basicInheritance;

public class Vehicle {

	String name;
	String color;
	double price;

	Vehicle() {

	}

	Vehicle(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String toString() {
		return "Name : " + name + "\t Color : " + color + "\t Price : " + price;

	}

}
