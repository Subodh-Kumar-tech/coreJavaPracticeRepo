package TimeAndDateApi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmployDriver {
	public static void main(String[] args) {

		Employ e1 = new Employ("mohan", 24, 35000, LocalDateTime.of(2025, 8, 12, 10, 10, 5), LocalDate.of(2002, 8, 15));

		System.out.println(e1);
	}
}
