package polymorphism.variableHiding;

public class Driver {

	public static void main(String[] args) {

		Pug p = new Pug();

		System.out.println("p is : " + p.s);
		System.out.println("z is : " + p.z);
		System.out.println("y is : " + p.y);
		System.out.println("x is : " + p.x);

		System.out.println();

		System.out.println("Pug i is : " + p.i);
		System.out.println("Dog i is : " + ((Dog) p).i);
		System.out.println("Pet Animal i is : " + ((PetAnimal) p).i);
		System.out.println("Animal i is : " + ((Animal) p).i);

	}

}
