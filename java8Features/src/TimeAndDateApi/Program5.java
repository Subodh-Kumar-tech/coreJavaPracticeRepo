package TimeAndDateApi;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Program5 {
	public static void main(String[] args) {

		LocalDate dob = LocalDate.of(2004, 5, 22);

		DayOfWeek dw = dob.getDayOfWeek();

		System.out.println(dw);

		String day = dob.getDayOfWeek().name();
		System.out.println(day);

	}

}
