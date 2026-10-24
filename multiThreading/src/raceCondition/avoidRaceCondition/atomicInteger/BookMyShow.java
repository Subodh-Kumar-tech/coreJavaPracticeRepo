package raceCondition.avoidRaceCondition.atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class BookMyShow {

	private AtomicInteger count = new AtomicInteger(0);

	public void increament() {
		// some code
		count.getAndIncrement();
		// some code
	}

	public int getCount() {
		return count.get();
	}

}
