package objectClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmployDriver {

	public static void main(String[] args) {

		Employ e1 = new Employ("mohan", 101, 25000);
		Employ e2 = new Employ("sohan", 102, 35000);
		Employ e3 = new Employ("mohan", 101, 25000);

		System.out.println("===equals===");

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		System.out.println();
		System.out.println("===equals()===");

		System.out.println(e1 == e2);
		System.out.println(e1 == e3);
		System.out.println();
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));

		System.out.println();
		System.out.println("====hascode()===");

		System.out.println(e1.hashcode());
		System.out.println(e2.hashcode());
		System.out.println(e3.hashcode());

		System.out.println();
		System.out.println("===getclass()===");

		System.out.println(e1.getClass());
		System.out.println(e2.getClass());
		System.out.println(e3.getClass());

		System.out.println();
		System.out.println("===getclass()-getsimpleName()===");

		System.out.println(e1.getClass().getSimpleName());
		System.out.println(e2.getClass().getSimpleName());
		System.out.println(e3.getClass().getSimpleName());

		System.out.println();
		System.out.println("===getfields===");

		Field[] fields = e1.getClass().getFields();
		for (Field x : fields) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("===getMethods()===");

		Method[] methods = e1.getClass().getMethods();

		for (Method x : methods) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("===clone()===");
		try {
			Employ e4 = (Employ) e1.clone();
			System.out.println(e1);
			System.out.println(e4);
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}

	}

}
