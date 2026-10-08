package inheritance.multipleInheritance.betweenInheritanceAndClass;

public class Helicopter extends GPS implements Moveable, Flyable {

	@Override
	public void fly() {
		System.out.println("helicopter is flying ");

	}

	@Override
	public void move() {
		System.out.println("helicopter is moving");
	}

	@Override
	public void changeDirection() {
		System.out.println("helicopter direction is being changed");
	}

	@Override
	public void location() {
		System.out.println("got the current location of helicopter");
	}

}
