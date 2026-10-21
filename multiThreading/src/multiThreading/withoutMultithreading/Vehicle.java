package multiThreading.withoutMultithreading;

public class Vehicle {

	String name;
	int distance;

	Vehicle() {

	}

	Vehicle(String name, int distance) {
		this.name = name;
		this.distance = distance;
	}

	public void start() {
		System.out.println(name + " starts");
		for (int i = 1; i <= distance; i++) {
			System.out.println(name + " covered " + i + " km ");
		}
		System.out.println(name + " reached to destination");
	}

}
