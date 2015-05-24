package engine.ConsoleEngine;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import engine.Engine;
import engine.InputListener;

public class ConsoleEngine implements Engine {

	private Scanner sc;
	private JFrame console;
	private static final int CONSOLE_WIDTH = 600;
	private static final int CONSOLE_HEIGHT = 700;
	private JTextArea textArea;
	private JTextField input;
	private JButton enterButton;
	private static final Font CONSOLE_FONT = new Font("Serif", Font.ITALIC, 16);
	private InputListener listener;

	public ConsoleEngine(InputListener listener) {
		sc = new Scanner(System.in);

		this.listener = listener;

		// initialisiere Konsole
		console = new JFrame("Beispiel JFrame");
		console.setSize(CONSOLE_WIDTH, CONSOLE_HEIGHT);
		JPanel panel = new JPanel();

		// initialisiere Textfield

		textArea = new JTextArea(30, 50);

		textArea.setEditable(false);
		// textArea.setFont(CONSOLE_FONT);

		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		// textArea.setSize(200, 200);

		JScrollPane textFieldScrollPanel = new JScrollPane(textArea);

		// initialisiere Input

		input = new JTextField(20);
		input.addKeyListener(new EnterListener());

		JScrollPane inputTextScrollPanel = new JScrollPane(input);

		// Input Button

		enterButton = new JButton();
		enterButton.setText("Enter");
		enterButton.addActionListener(new ButtonListener());
		enterButton.setEnabled(false);

		// eingabe Text

		JLabel inputText = new JLabel();
		inputText.setText("Eingabe");

		// zuweisung
		panel.add(textFieldScrollPanel);
		panel.add(inputText);
		panel.add(inputTextScrollPanel);
		panel.add(enterButton);

		console.add(panel);
		console.setVisible(true);
	}

	@Override
	public void printWindowMessage(String message) {
		println(message);

	}

	@Override
	public void printErrorMessage(String message) {
		println(message);
	}

	@Override
	public void printSystemMessage(String message) {
		println(message);
	}

	public void println(String message) {
		print(message + " \n");
	}

	@Override
	public void println(Object obj) {

		print(obj.toString() + " \n");

	}

	@Override
	public void print(Object obj) {

		if (obj != null) {
			System.out.print(obj.toString());
			textArea.append(obj.toString());
			textArea.setCaretPosition(textArea.getDocument().getLength());
		}

	}

	@Override
	public void print(String message) {
		textArea.append(message);
		textArea.setCaretPosition(textArea.getDocument().getLength());
		System.out.print(message);
	}

	@Override
	public void askForStringInput(String inputMessage) {

		this.println(inputMessage);
		this.enterButton.setEnabled(true);

	}

	public class ButtonListener extends JFrame implements ActionListener {

		/**
		 * 
		 */
		private static final long serialVersionUID = 4808494044559399165L;

		@Override
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == enterButton) {
				performInputAction();
			}

		}

	}

	public class EnterListener extends JFrame implements KeyListener {

		/**
		 * 
		 */
		private static final long serialVersionUID = 9196668079757453961L;

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				performInputAction();
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			}
		}

		@Override
		public void keyTyped(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			}
		}
	}

	private void performInputAction() {
		if (enterButton.isEnabled()) {
			listener.buttonActionPerformed(input.getText());
			input.setText("");
		}
		enterButton.setEnabled(false);
	}

	@Override
	public void print(List<String> list) {

		if (list != null) {

			int z = 1;

			for (Object o : list) {
				print(z + ".  " + o.toString() + "\n");
				z++;
			}

		}

	}

	@Override
	public void clear() {
		
		this.textArea.setText("");
		
	}

}
