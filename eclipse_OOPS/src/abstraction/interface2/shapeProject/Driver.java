package abstraction.interface2.shapeProject;

public class Driver {

	public static void main(String[] args) {

		Game game = new Game();
		do {
			game.start();
		} while (game.doYouWantToContinue());

		System.out.println("game is over");

	}

}
