package assignment07;

public class PrintNum implements Runnable {

	private int amtToPrint;
	
	public PrintNum(int amtToPrint) {
		this.amtToPrint = amtToPrint;
	}

	@Override
	public void run() {
		
		for (int i = 1; i <= amtToPrint; i++) {
			System.out.print(i + " ");
		}

	}

}
