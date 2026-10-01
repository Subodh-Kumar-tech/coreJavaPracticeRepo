package TimeAndDateApi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Program4 {
	public static void main(String[] args) {

		LocalDateTime dt1 = LocalDateTime.of(1995, 8, 15, 8, 40, 12);
		LocalDateTime dt2 = LocalDateTime.of(2000, 10, 20, 10, 30, 10);

		LocalTime t1 = LocalTime.of(4, 45, 10);
		LocalTime t2 = LocalTime.of(8, 50, 2);

		Duration dur1 = Duration.between(t1, t2);
		System.out.println(dur1);

		Duration dur2 = Duration.between(dt1, dt2);

		System.out.println(dur2);
	}
}
