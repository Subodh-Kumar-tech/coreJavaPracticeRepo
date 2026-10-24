package raceCondition.avoidRaceCondition.threadLocal;

public class BookMyShow {

	private volatile ThreadLocal<Integer> count = ThreadLocal.withInitial(() -> 0);

	public void increament() {
		// some code

		count.set(count.get() + 1);

		// some code
	}

	public int getCount() {
		return count.get();
	}

	public void clear() {
		count.remove();
	}

}
