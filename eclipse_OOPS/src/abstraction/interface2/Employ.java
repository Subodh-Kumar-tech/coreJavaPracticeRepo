package abstraction.interface2;

import java.io.Serializable;

public class Employ implements Serializable, Cloneable {
	String name;

	Employ(String name) {
		this.name = name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Employ e1 = new Employ("mohan");
		Employ e2 = (Employ) e1.clone();

		System.out.println(e1.name);
		System.out.println(e2.name);

	}
}
