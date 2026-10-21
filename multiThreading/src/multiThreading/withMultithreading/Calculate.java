package multiThreading.withMultithreading;

public class Calculate implements Runnable {

	long num;

	Calculate() {

	}

	Calculate(long num) {
		this.num = num;
	}

	public void sum() {
		long sum = 1;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	@Override
	public void run() {
		sum();
	}

}
