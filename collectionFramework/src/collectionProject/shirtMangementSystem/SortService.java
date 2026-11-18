package collectionProject.shirtMangementSystem;

import java.util.Comparator;
import java.util.List;

public class SortService {

	public static void sortOnSizeLowToHigh(List<Shirt> shirts) {
		shirts.sort(Comparator.comparingInt((Shirt s) -> s.size));
		for (Shirt s : shirts)
			System.out.println(s);
	}

	public static void sortOnSizeHighToLow(List<Shirt> shirts) {
		shirts.sort(Comparator.comparingInt((Shirt s) -> s.size).reversed());
		for (Shirt s : shirts)
			System.out.println(s);
	}

}