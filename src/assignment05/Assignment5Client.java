package assignment05;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Assignment5Client extends JFrame {

	private JTextArea jta1 = new JTextArea();
	private JTextArea jta2 = new JTextArea();
	
	private PrintWriter toServer;

	public Assignment5Client() {
		
		setLayout(new GridLayout(2, 1, 5, 5));
		
		jta1.setWrapStyleWord(true);
		jta1.setWrapStyleWord(true);
		jta2.setLineWrap(true);
		jta2.setLineWrap(true);
		jta1.setEditable(false);
		
		JScrollPane jsp1 = new JScrollPane(jta1);
		JScrollPane jsp2 = new JScrollPane(jta2);
		
		jsp1.setBorder(new TitledBorder("Client"));
		jsp2.setBorder(new TitledBorder("Server"));
		
		add(jsp1);
		add(jsp2);
		
		setTitle("ChatClient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 500);
		setLocationRelativeTo(null);
		setVisible(true);

		jta2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					toServer.print(jta2.getText().split("\n")[jta2.getLineCount() - 1] + "\n");
					toServer.flush();
				}
			}
		});

		try {
			Socket socket = new Socket("localhost", 8000);
			toServer = new PrintWriter(socket.getOutputStream());
			new ReceiveMessage(socket);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class ReceiveMessage implements Runnable {
		private Socket socket;

		public ReceiveMessage(Socket socket) {
			this.socket = socket;
			Thread thread = new Thread(this);
			thread.start();
		}

		public void run() {
			try {
				@SuppressWarnings("resource")
				Scanner fromServer = new Scanner(socket.getInputStream());
				while (true) {
					String text = fromServer.nextLine();
					jta1.append(text + "\n");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Assignment5Client();
	}
}
