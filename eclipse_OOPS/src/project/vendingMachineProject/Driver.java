package project.vendingMachineProject;

public class Driver {
	public static void main(String[] args) {

		VendingMachine vm = new VendingMachine();

		Beberage b = vm.selectBeberage();

		b.eat();
	}

}
