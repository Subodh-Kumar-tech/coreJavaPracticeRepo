package objectClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FruitDriver {

	public static void main(String[] args) {

		Fruit f1 = new Fruit("Apple", 120, 2, "red");
		Fruit f2 = new Fruit("mango", 150, 5, "yellow");
		Fruit f3 = new Fruit("Apple", 120, 2, "red");

		System.out.println("=========toString()===========");

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

		System.out.println("=====equals()=====");

		System.out.println(f1 == f2);
		System.out.println(f1 == f3);

		System.out.println();

		System.out.println(f1.equals(f2));
		System.out.println(f1.equals(f3));

		System.out.println("===hashCode()===");

		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		System.out.println(f3.hashCode());

		System.out.println("====clone()===");

		try {

			Fruit f4 = (Fruit) f1.clone();

			System.out.println(f1);
			System.out.println(f4);

		} catch (CloneNotSupportedException e) {
			System.out.println(e);

		}

		System.out.println("===getClass()===");

		System.out.println(f1.getClass());
		System.out.println(f2.getClass());
		System.out.println(f3.getClass());

		System.out.println("===getClass().getSimpleName()===");

		System.out.println(f1.getClass().getSimpleName());
		System.out.println(f2.getClass().getSimpleName());
		System.out.println(f3.getClass().getSimpleName());

		System.out.println("===getFields()===");

		Field[] fields = f1.getClass().getFields();

		for (Field n : fields) {
			System.out.println(n);
		}

		System.out.println("===getMethods()===");

		Method[] methods = f1.getClass().getMethods();

		for (Method n : methods) {
			System.out.println(n);
		}

	}

}
