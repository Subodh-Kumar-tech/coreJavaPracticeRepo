package project.weaponGameProject;

public class Game {

	static {
		System.out.println("===welcome to the playGround===");

	}

	// score 0-400 -> knife
	// score 400-800 ->knife,gun
	// score 800-1200->knife,gun,bomb
	// score 1200> ->knife,gun,bomb,tank

	public Weapon selectAndGetWeapon() {

		int score = Integer.parseInt(IO.readln("Enter your score : "));
//		int choice = Integer.parseInt(IO.readln("Enter your choice : "));
		if (score <= 400) {
			System.out.println("you are on level 1 ");
			System.out.println("you can only use knife as weapon for battle");

			return new Knife();

		} else if (score <= 800) {
			System.out.println("congratulation you are now on level 2");
			System.out.println("you can select knife and gun as weapon for battle");
			System.out.println("now enter  choice for weapon");
			System.out.println(" press 1 for knife or press 2 for gun");
			int choice = Integer.parseInt(IO.readln("select a weapon : "));

			if (choice == 1) {
				System.out.println("you have selected knife");
				return new Knife();
			} else if (choice == 2) {
				System.out.println("you have selected gun");
				return new Gun();
			} else {
				return selectAndGetWeapon();
			}

		}

		else if (score <= 1200) {
			System.out.println("congratulation you are now on level 3");
			System.out.println("your can select knife,gun and bomb as weapon for battle");
			System.out.println("now enter choice for weapon");
			System.out.println("press 1 for knife , press 2 for gun, press 3 for bomb");

			int choice = Integer.parseInt(IO.readln("select a weapon : "));

			switch (choice) {

			case 1:
				System.out.println("you have selected knife");
				return new Knife();
			case 2:
				System.out.println("you have selected gun");
				return new Gun();

			case 3:
				System.out.println("you have selected bomb");
				return new Bomb();
			default:
				return selectAndGetWeapon();
			}

		}

		else if (score > 1200) {
			System.out.println("congratulation you are now on level 4");
			System.out.println("uou can select knife,gun,bomb and tank");
			System.out.println("now enter your choice for weapon ");
			System.out.println("press 1 for knife");

			int choice = Integer.parseInt(IO.readln("select your weapon : "));

			switch (choice) {

			case 1:
				System.out.println("you have selected knife");
				return new Knife();
			case 2:
				System.out.println("you have selected gun");
				return new Gun();
			case 3:
				System.out.println("your have selected bomb");
				return new Bomb();
			case 4:
				System.out.println("you have selected tank");
				return new Tank();
			default:
				return selectAndGetWeapon();

			}
		} else {
			return selectAndGetWeapon();
		}

	}

}
