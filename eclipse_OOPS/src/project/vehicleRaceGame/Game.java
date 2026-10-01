package project.vehicleRaceGame;

public class Game {

	static {
		System.out.println("===welcome to race game===");
	}

	public Vehicle selectAndGetVehicle() {

		System.out.println("select a vehicle");

		System.out.println("press 1 for cycle...");
		System.out.println("press 2 for bike...");
		System.out.println("press 3 for car...");
		System.out.println("press 4 for truck...");

		int choice = Integer.parseInt(IO.readln("enter you choice..."));

		switch (choice) {
		case 1:
			return new Cycle();
		case 2:
			return new Bike();
		case 3:
			return new Car();
		case 4:
			return new Truck();
		default:
			return selectAndGetVehicle();

		}

	}

}
