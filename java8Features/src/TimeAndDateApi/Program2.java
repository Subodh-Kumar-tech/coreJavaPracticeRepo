package TimeAndDateApi;

import java.time.LocalTime;

public class Program2 {
	public static void main(String[] args) {

		LocalTime l1 = LocalTime.now();

		System.out.println(l1);

		LocalTime l2 = LocalTime.of(8, 25, 20);

		System.out.println(l2);

		System.out.println("===========");

		System.out.println(l1.getHour() + ":" + l1.getMinute() + ":" + l1.getSecond());

	}

}
