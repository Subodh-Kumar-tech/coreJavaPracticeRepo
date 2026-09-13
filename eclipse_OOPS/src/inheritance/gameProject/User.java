package inheritance.gameProject;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game g = new Game();
		Vehicle v = (Car) g.setAndGetVehicle();

		if (v instanceof Car) {
			System.out.println("Car recieved");
			Car c = (Car) v;
			System.out.println("Brand of car is : " + c.brand);
			System.out.println("Price of car is : " + c.price);
			System.out.println("Hp of car is : " + c.hp);
			System.out.println("Stroke of car is : " + c.stroke);

		} else if (v instanceof Bike) {
			System.out.println("Bike recieved");
			Bike b = (Bike) v;
			System.out.println("Brand of Bike is : " + b.brand);
			System.out.println("Price of Bike is : " + b.price);
			System.out.println("Engine type  of Bike is : " + b.engineType);
			System.out.println("cc of Bike is : " + b.cc);

		} else if (v instanceof Bus) {
			System.out.println("Bus recieved");

			Bus b2 = (Bus) v;
			System.out.println("Brand of Bus : " + b2.brand);
			System.out.println("Price of Bus : " + b2.price);
			System.out.println("Bus Tpe of Bus : " + b2.busTpe);
			System.out.println("Capacity of Bus : " + b2.capacity);
		}

	}

}
