package project.selfAllotedProject;

public class Driver {
	public static void main(String[] args) {
		Book b1 = new Book("cicago", 43435, "vivekanand");
		Book b2 = new Book("hack the teck", 1234, "eintein");

		DVD d1 = new DVD("dhurandhar", 2334, 120);
		DVD d2 = new DVD("mirzapur", 343, 300);

		d1.getAvailability();
		d1.borrowItem();
		d1.getAvailability();

		d1.calculateLateFee(10);

	}
}
