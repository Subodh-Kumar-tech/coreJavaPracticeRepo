package collectionProject.shirtMangementSystem;

import java.util.ArrayList;
import java.util.List;

public class Service {
	private List<Shirt> shirts = new ArrayList<>();

	{
		shirts.add(new Shirt("Pepe", 1800, 40, "White"));
		shirts.add(new Shirt("BlackB", 1900, 44, "Red"));
		shirts.add(new Shirt("VanHu", 2800, 38, "Black"));
		shirts.add(new Shirt("Levis", 1800, 38, "Blue"));
		shirts.add(new Shirt("Pepe", 1800, 40, "White"));
		shirts.add(new Shirt("Pepe", 1800, 42, "White"));
	}

	public List<Shirt> getAllShirts() {
		return new ArrayList<>(shirts);
	}

	public void addShirt() {
		try {
			String brand = IO.readln("Enter Brand: ");
			double price = Double.parseDouble(IO.readln("Enter Price: "));
			int size = Integer.parseInt(IO.readln("Enter Size: "));
			String color = IO.readln("Enter Color: ");
			shirts.add(new Shirt(brand, price, size, color));
			System.out.println("Shirt added successfully!");
		} catch (Exception e) {
			System.out.println("Shirt is NOT added successfully!");
			System.out.println(e.getMessage());
		}
		System.out.println("Press Y/y to add another shirt");
		char choice = IO.readln("Enter Choice: ").charAt(0);
		if (choice == 'y' || choice == 'Y')
			addShirt();
	}

	public void printAllShirts() {
		for (Shirt s : shirts)
			System.out.println(s);
	}

	public void accessByBrand() {
		String brand = IO.readln("Enter the Brand: ");
		for (Shirt s : shirts) {
			if (s.brand.equalsIgnoreCase(brand))
				System.out.println(s);
		}
	}

}