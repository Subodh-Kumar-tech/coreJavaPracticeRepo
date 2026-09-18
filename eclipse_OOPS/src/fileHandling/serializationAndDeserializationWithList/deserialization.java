package fileHandling.serializationAndDeserializationWithList;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class deserialization {

	public static void main(String[] args) {
		// deserialization with list

		try (FileInputStream fis = new FileInputStream("Employ5.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			List<Employ> l2 = (List<Employ>)ois.readObject();

			for (Employ x : l2) {
				System.out.println(x.getCompanyName() + " " + x.getName() + " " + x.getEmpId() + " " + x.getpswd());
			}

		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}
