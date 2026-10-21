package multiThreading.withMultithreading;

public class MyThread {

	public static void main(String[] args) {

		// to get the details of thread -
		System.out.println(Thread.currentThread()); // Thread[#3,main,5,main]

		// here #3 means id of thread
		// main means thread name
		// 5 means priority of thread
		// main - source of thread

		// to get thread name
		System.out.println(Thread.currentThread().getName()); // main

		// to get thread id and getId() is removed or deprecated now
		System.out.println(Thread.currentThread().getId()); // 3

		// to get thread priority
		System.out.println(Thread.currentThread().getPriority()); // 5

		// set priority changing priority from 5 to 8
		Thread.currentThread().setPriority(8);

		// set name of the thread
		Thread.currentThread().setName("main-method");

		// again display value after changing priority and name of thread

		System.out.println(Thread.currentThread()); // Thread[#3,main-method,8,main]

	}

}
