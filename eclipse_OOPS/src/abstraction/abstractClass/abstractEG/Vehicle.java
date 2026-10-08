package abstraction.abstractClass.abstractEG;

public abstract class Vehicle {

	String name;
	double price;
	String color;

	static {
		System.out.println("vehicle class static block");
	}

	{
		System.out.println("vehicle class non-static block");
	}

	Vehicle() {

	}

	Vehicle(String name, double price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public abstract void drive();

	public String toString() {
		return "Name : " + name + "\tPrice : " + price + "\tColor : " + color;
	}

}
