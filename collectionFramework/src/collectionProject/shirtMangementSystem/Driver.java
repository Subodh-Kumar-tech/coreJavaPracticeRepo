package collectionProject.shirtMangementSystem;

public class Driver {
	public static void main(String[] args) {
		Service service = new Service();
		// service.addShirt();
		// service.printAllShirts();
		// service.accessByBrand();

		SortService.sortOnSizeHighToLow(service.getAllShirts());
		System.out.println("===================");
		service.printAllShirts();
		System.out.println("==============");
		SortService.sortOnSizeLowToHigh(service.getAllShirts());
	}

}