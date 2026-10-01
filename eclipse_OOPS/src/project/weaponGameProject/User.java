package project.weaponGameProject;

public class User {

	public static void main(String[] args) {

		Game game = new Game();

		Weapon w = game.selectAndGetWeapon();

		w.use();
	}

}
