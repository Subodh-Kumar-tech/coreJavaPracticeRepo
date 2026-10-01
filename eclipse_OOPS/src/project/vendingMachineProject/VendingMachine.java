package project.vendingMachineProject;

public class VendingMachine {

	{
		System.out.println("=======welcome to the vending machine=======");
	}

	public Beberage selectBeberage() {
		System.out.println("press 1 for cofee...");
		System.out.println("press 2 for wine...");
		System.out.println("press 3 for coke...");
		System.out.println("press 4 for juice...");
		int choice = Integer.parseInt(IO.readln("press button to get Beberages : "));

		switch (choice) {
		case 1:
			return new Coffee();
		case 2:
			return new Wine();
		case 3:
			return new Coke();
		case 4:
			return new Juice();
		default:
			return selectBeberage();
		}

	}

}
