package fileHandling.serializationAndDeserializationWithList;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class serialization {

	public static void main(String[] args) {
		// serialization via list

		List<Employ> l1 = new ArrayList<>();
		char choice;

		do {
			String companyName = IO.readln("Enter companyName : ");
			String name = IO.readln("Enter Name : ");
			String empId = IO.readln("Enter empId : ");
			String pswd = IO.readln("Enter pswd : ");

			Employ e1 = new Employ(companyName, name, empId, pswd);
			l1.add(e1);
			choice = IO.readln("Enter Y/y for new Object : ").charAt(0);

		} while (choice == 'Y' || choice == 'y');

		try (FileOutputStream fos = new FileOutputStream("Employ5.ser", true);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			oos.writeObject(l1);

			System.out.println("Serialization Successful");

		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

//		for (Employ e : l1) {
//			System.out.println(e.getCompanyName() + " " + e.getName() + " " + e.getEmpId() + " " + e.getpswd());
//		}

	}

}
