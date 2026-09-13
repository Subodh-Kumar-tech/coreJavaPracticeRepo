package project.selfAllotedProject;

public class DVD extends LibraryItem {

	int durationMinutes;

	DVD() {

	}

	DVD(String tittle, int itemId, int durationMinutes) {
		super(tittle, itemId);
		this.durationMinutes = durationMinutes;
	}

	public void calculateLateFee(int daysLate) {
		System.out.println("total Late Fee is : " + daysLate * 1.5);
	}
}
