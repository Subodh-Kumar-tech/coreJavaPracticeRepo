package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {

	public static void main(String[] args) {

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

//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
//		t6.start();
//		t7.start();
//		t8.start();
//		t9.start();
//		t10.start();

		ExecutorService service = Executors.newFixedThreadPool(3); // Threadpool cretaed with 3 threads

		service.submit(t1);
		service.submit(t2);
		service.submit(t3);
		service.submit(t4);
		service.submit(t5);
		service.submit(t6);
		service.submit(t7);
		service.submit(t8);
		service.submit(t9);
		service.submit(t10);

		service.shutdown();

	}

}
