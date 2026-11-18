package queue;

public class Task implements Comparable<Task> {

	String name;
	int workers;
	double amount;
	int days;

	Task(String name, int workers, double amount, int days) {
		this.name = name;
		this.workers = workers;
		this.amount = amount;
		this.days = days;
	}

	public String toString() {

		return "Name : " + name + "\tWorkers : " + workers + "\tAmount : " + amount + "\tdays : " + days;
	}

	public int compareTo(Task t) {
		return this.workers - t.workers;
	}

}
