package objectClass;

import java.util.Objects;

public class Fruit implements Cloneable {

	public String name;
	public int price;
	public double weight;
	public String color;

	Fruit(String name, int price, double weight, String color) {
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.color = color;
	}

	public String toString() {
		return "Name : " + name + "\tPrice : " + price + "\tWeight : " + weight + "\tColor : " + color;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}

		Fruit f = (Fruit) obj;
		return this.name.equalsIgnoreCase(f.name) && this.price == f.price && this.weight == f.weight
				&& this.color.equalsIgnoreCase(f.color);
	}

	public int hashCode() {
		return Objects.hash(name, price, weight, color);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
