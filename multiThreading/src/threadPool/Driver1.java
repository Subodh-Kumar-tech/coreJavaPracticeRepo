package threadPool;

public class Driver1 {

	public static void main(String[] args) throws InterruptedException {
		Task t1 = new Task("Task-1");
		Task t2 = new Task("Task-2");
		Task t3 = new Task("Task-3");
		Task t4 = new Task("Task-4");
		Task t5 = new Task("Task-5");
		Task t6 = new Task("Task-6");
		Task t7 = new Task("Task-7");
		Task t8 = new Task("Task-8");
		Task t9 = new Task("Task-9");
		Task t10 = new Task("Task-10");

		Thread th1 = Thread.ofVirtual().name("X-1").unstarted(t1);
		th1.start();

		Thread th2 = Thread.ofVirtual().name("X-2").start(t2);
		Thread th3 = Thread.startVirtualThread(t3);
		Thread th4 = Thread.startVirtualThread(t4);
		Thread th5 = Thread.startVirtualThread(t5);
		Thread th6 = Thread.startVirtualThread(t6);
		Thread th7 = Thread.startVirtualThread(t7);
		Thread th8 = Thread.startVirtualThread(t8);
		Thread th9 = Thread.startVirtualThread(t9);
		Thread th10 = Thread.startVirtualThread(t10);

		th1.join();
		th2.join();
		th3.join();
		th4.join();
		th5.join();
		th6.join();
		th7.join();
		th8.join();
		th9.join();
		th10.join();
	}

}
