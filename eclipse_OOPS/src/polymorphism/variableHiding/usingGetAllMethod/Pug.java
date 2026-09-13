package polymorphism.variableHiding.usingGetAllMethod;

public class Pug extends Dog {
	int s = 40;
	int i = 42;

	public void getAll() {

		int q = 50;
		int i = 52;

		System.out.println("q is : " + q);
		System.out.println("s is : " + this.s);
		System.out.println("z is : " + super.z);
		System.out.println("y is : " + super.y);
		System.out.println("x is : " + super.x);

		System.out.println();

		System.out.println("local i is : " + i);
		System.out.println("pug i is : " + this.i);
		System.out.println("Dog i is : " + super.i);
		System.out.println("Dog i is : " + ((Dog) this).i);
		System.out.println("petAnimal i is : " + ((PetAnimal) this).i);
		System.out.println("Animal i is : " + ((Animal) this).i);

	}

}
