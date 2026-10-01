package TimeAndDateApi;

import java.time.LocalDate;

public class Program1 {
	public static void main(String[] args) {

		LocalDate d1 = LocalDate.now();

		System.out.println(d1);

		LocalDate d2 = LocalDate.of(1995, 8, 24);

		System.out.println(d2);
	}

}
