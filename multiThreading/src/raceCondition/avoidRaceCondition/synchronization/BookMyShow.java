package raceCondition.avoidRaceCondition.synchronization;

public class BookMyShow {

	int count;

//	public void increament() {
//		count++;
//	}

	// there is two way to avoid race condition 1) synchronized method, 2)
	// synchronized block

//	// Synchronized method
//	public synchronized void increament() {
//		count++;
//	}

	public void increament() {

		synchronized (this) {
			count++;
		}

	}

	public int getCount() {
		return count;
	}

}
