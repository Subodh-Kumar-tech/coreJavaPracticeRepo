package wrapperClass;

import java.util.ArrayList;
import java.util.List;

public class Program9 {
	public static void main(String[] args) {

		// this is example of like list in add method takes or store element as Object
		// so be can give any type of data like integer,float,string,boolean,Object;

		List l = new ArrayList();

		l.add(10);
		l.add(52.55);
		l.add("Abcde");
		l.add(true);
		l.add('c');

		l.add(new Car("maruti", 55000));

		System.out.println(l);
	}
}
