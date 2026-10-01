package project.vendingMachineProject;

public class Coffee extends Beberage {

	@Override
	public void eat() {
		System.out.println("you have selected coffee!");
		System.out.println("Add some ice and coffee powder");
		System.out.println("Enjoy your cofee");
	}
}
