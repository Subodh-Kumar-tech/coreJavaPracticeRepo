package project.vehicleRaceGame;

public class Driver {

	public static void main(String[] args) {

		Game game = new Game();

		Vehicle v = game.selectAndGetVehicle();

		v.drive();

	}

}
