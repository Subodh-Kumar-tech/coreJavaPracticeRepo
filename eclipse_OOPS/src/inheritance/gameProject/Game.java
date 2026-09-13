package inheritance.gameProject;

public class Game {

	public Vehicle setAndGetVehicle() {
		System.out.println("Press 1 for Car");
		System.out.println("Press 2 for Bike");
		System.out.println("press 3 for Bus");

		int choice = Integer.parseInt(IO.readln("Enter Your Choice : "));

		switch (choice) {
		case 1:
			System.out.println("You have selected Car");
			String brand = IO.readln("Enter the brand of Car : ");
			int price = Integer.parseInt(IO.readln("Enter the price of Car"));
			int hp = Integer.parseInt(IO.readln("Enter the hp of Car"));
			int stroke = Integer.parseInt(IO.readln("Enter the stroke of Car"));

			Car c = new Car(brand, price, hp, stroke);
			return c;

		case 2:
			System.out.println("You have selected Bike");
			String brand1 = IO.readln("Enter brand of Bike");
			int price1 = Integer.parseInt(IO.readln("Enter the price of Bike"));
			String engineType = IO.readln("Enter the engine Type of Bike");
			int cc = Integer.parseInt(IO.readln("Enter the cc of Bike"));

			Bike b = new Bike(brand1, price1, engineType, cc);

			return b;

		case 3:
			System.out.println("You have selected Bus");

			String brand2 = IO.readln("Enter the brand of Bus");
			int price2 = Integer.parseInt(IO.readln("Enter the price of Bus"));
			String busType = IO.readln("Enter the bus Type of Bus");
			int capacity = Integer.parseInt(IO.readln("Enter the capacity of Bus"));

			return new Bus(brand2, price2, busType, capacity);

		default:
			System.out.println("Invalid Choice");
			return setAndGetVehicle();

		}
	}
}
