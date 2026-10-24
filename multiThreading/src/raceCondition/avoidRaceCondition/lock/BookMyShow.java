package raceCondition.avoidRaceCondition.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BookMyShow {

	private volatile int count;

	private Lock l = new ReentrantLock();

	public void increament() {
		// some code
		l.lock();

		try {
			count++;
		} finally {
			l.unlock();
		}

		// some code
	}

	public int getCount() {
		return count;
	}

}
