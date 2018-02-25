package assignment04;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Main extends JApplet {
	
	private float firstNumber;
	private float secondNumber;
	private float sum, product, difference, quotient;
	
	public void init() {
		
		firstNumber = Float.parseFloat(JOptionPane.showInputDialog("Enter the first floating-point value"));
		
		secondNumber = Float.parseFloat(JOptionPane.showInputDialog("Enter the second floating-point value"));
		
		sum = firstNumber + secondNumber;
		product = firstNumber * secondNumber;
		difference = firstNumber - secondNumber;
		quotient = firstNumber / secondNumber;
		
	}
	
	public void paint(Graphics g) {
		
		g.drawString("The sum is " + String.valueOf(sum), 30, 25);
		g.drawString("The product is " + String.valueOf(product), 30, 35);
		g.drawString("The difference is " + String.valueOf(difference), 30, 45);
		g.drawString("The quotient is " + String.valueOf(quotient), 30, 55);
		
	}
	
}
