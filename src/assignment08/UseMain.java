package assignment08;

public class UseMain {

	public static void main(String[] args) {
		
		// Reference main thread
		Thread mainThread = Thread.currentThread();
		
		// Sets the threads name
		mainThread.setName("main");
		
		// Set thread priority as NORM_PRIORITY (5)
		mainThread.setPriority(5);
		
		System.out.println("Main thread is called: " + mainThread.getName());
		System.out.println("Priority: " + mainThread.getPriority());
		
		// Change thread name
		mainThread.setName("Thread");
		
		System.out.println("Main thread is now called: " + mainThread.getName());
		
		// Set thread priority as MAX_PRIORITY (10)
		mainThread.setPriority(10);
		
		System.out.println("Priority is now: " + mainThread.getPriority());
		
		// Adding this will make the program never terminate
		/*
		try {
			mainThread.join();
		} catch (InterruptedException exc) {
			System.out.println("Interrupted");
		}
		*/

	}

}
