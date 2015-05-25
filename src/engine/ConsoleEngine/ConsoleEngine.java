package engine.ConsoleEngine;

import java.awt.Dimension;
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
import javax.swing.JTextPane;
import javax.swing.text.html.HTMLEditorKit;

import engine.Engine;
import engine.InputListener;

public class ConsoleEngine implements Engine {

	private Scanner sc;
	private JFrame console;
	private static final int CONSOLE_WIDTH = 600;
	private static final int CONSOLE_HEIGHT = 700;
	private JTextPane textArea;
	private JTextField input;
	private JButton enterButton;
	private static final Font CONSOLE_FONT = new Font("Serif", Font.ITALIC, 16);
	private InputListener listener;
	
	private String text;
	private String wallOfShame;

	public ConsoleEngine(InputListener listener, String name) {
		sc = new Scanner(System.in);

		wallOfShame = IOSystem.readSaveFile();
		
		text = "";
		
		this.listener = listener;

		// initialisiere Konsole
		console = new JFrame(name);
		console.setSize(CONSOLE_WIDTH, CONSOLE_HEIGHT);
		JPanel panel = new JPanel();
		
		// initialisiere Textfield

		textArea = new JTextPane ();
		textArea.setBounds(10, 10, 550, 600);
		
		textArea.setContentType("text/html");
		

		textArea.setEditable(false);
		// textArea.setFont(CONSOLE_FONT);

		// textArea.setSize(200, 200);

		JScrollPane textFieldScrollPanel = new JScrollPane(textArea);
		textFieldScrollPanel.setPreferredSize(new Dimension( 550, 600 ) );

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
		print(message + " <br>");
	}

	@Override
	public void println(Object obj) {

		print(obj.toString() + " <br>");

	}

	@Override
	public void print(Object obj) {

		if (obj != null) {
			setText(obj.toString());
		}

	}

	@Override
	public void print(String message) {
		setText(message.toString());
	}
	
	
	private void setText(String message){
		
		
		message = HtmlFormatter.convertJavaToHtml(message);
		text += message;
		
		textArea.setText("<!DOCTYPE html><HTML lang=\"de\"><head></head><BODY>" + text + " </BODY></HTML>");
		textArea.setCaretPosition(textArea.getDocument().getLength());
		
		System.out.println("<!DOCTYPE html lang=\"de\"><HTML><head></head><BODY>" + text + " </BODY></HTML>");
		
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
				print(HtmlFormatter.convertJavaToHtml(o.toString()));
				z++;
			}

		}

	}

	@Override
	public void clear() {
		
		text = "";
		
		this.textArea.setText("");
		
	}

	@Override
	public void printlnWelcomeMessage(String message) {
		
		message = "<div style=\"width:100%;font-size:20px; text-align: center;\">" + message + "</div>"; 
		this.print(message);
	}

	@Override
	public void printStrong(String message) {
		
		message = "<strong>"+ message +"</strong>";
		this.print(message);
	}

	@Override
	public void printEpic(String message) {
		
		message = "<div style=\"font-size:50px;width:100%; text-align: center;\"><strong>"+ message +"</div>";
		this.print(message);
	}

}
