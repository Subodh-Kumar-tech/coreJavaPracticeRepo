package TimeAndDateApi;

import java.time.LocalDateTime;

public class Program3 {
	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();

		System.out.println(dt);

		LocalDateTime dt2 = LocalDateTime.of(1996, 5, 21, 2, 52, 15);
		System.out.println(dt2);

	}
}
