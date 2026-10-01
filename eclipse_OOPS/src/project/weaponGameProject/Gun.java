package project.weaponGameProject;

public class Gun extends Weapon {

	@Override
	public void use() {
		System.out.println("Load the gun");
		System.out.println("pull the trigger");
		System.out.println("now fire the bullet to kill the enemy!");
	}
}
