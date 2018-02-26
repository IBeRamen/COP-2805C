package assignment07;

public class PrintChar implements Runnable {

	private int amtToPrint;
	private char letter;
	
	public PrintChar(char letter, int amtToPrint) {
		this.letter = letter;
		this.amtToPrint = amtToPrint;
	}

	@Override
	public void run() {
		
		for (int i = 0; i <= amtToPrint; i++) {
			System.out.print(letter + " ");
		}
		
	}

}
