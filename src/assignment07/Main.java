package assignment07;

public class Main {

	public static void main(String[] args) {

		// Create the tasks
		Runnable task1 = new PrintChar('a', 100);
		Runnable task2 = new PrintChar('b', 100);
		Runnable task3 = new PrintNum(100);

		// Declare the threads
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);
		
		// Start the threads
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
