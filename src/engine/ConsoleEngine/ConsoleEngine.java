package engine.ConsoleEngine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import text.adventure.game.Player;
import engine.Engine;
import engine.InputListener;

public class ConsoleEngine implements Engine {

	private JFrame console;
	private static final int CONSOLE_WIDTH = 600;
	private static final int CONSOLE_HEIGHT = 700;
	private JTextPane textArea;
	private JTextField input;
	private JButton enterButton;
	private InputListener listener;

	private String text;

	public ConsoleEngine(InputListener listener, String name) {

		text = "";

		this.listener = listener;

		// initialisiere Konsole
		console = new JFrame(name);
		console.setSize(CONSOLE_WIDTH, CONSOLE_HEIGHT);
		JPanel panel = new JPanel();

		// initialisiere Textfield

		textArea = new JTextPane();
		textArea.setBounds(10, 10, 550, 600);

		textArea.setContentType("text/html");

		textArea.setEditable(false);
		// textArea.setFont(CONSOLE_FONT);

		// textArea.setSize(200, 200);

		JScrollPane textFieldScrollPanel = new JScrollPane(textArea);
		textFieldScrollPanel.setPreferredSize(new Dimension(550, 600));

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

	private void setText(String message) {

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
	public void printPlayerList(List<Player> list) {

		Collections.sort(list, new Comparator<Player>() {
			public int compare(Player p1, Player p2) {

				if (p1.getScore() == p2.getScore()) {
					return 0;
				}

				if (p1.getScore() < p2.getScore()) {
					return 1;
				}

				return -1;
			}
		});

		String text = "<table style=\"width:100%\">";

		text += "<tr>";
		text += "<td style=\"text-align:center\">Platz</td>";
		text += "<td style=\"text-align:center\">Spieler</td>";
		text += "<td style=\"text-align:center\">Punkte</td>";
		text += "</tr>";

		for (int i = 0; i < list.size(); i++) {
			final Player player = list.get(i);
			text += "<tr>";
			text += "<td style=\"text-align:center\">"+ (i+1) + ".</td>";
			text += "<td style=\"text-align:center\">"+ player.getPlayerName() + "</td>";
			text += "<td style=\"text-align:center\">"+ player.getScore() + "</td>";
			text += "</tr>";
		}

		text += "</table>";
		print(text);

	}

	@Override
	public void print(List<String> list) {

		// System.out.println("\n liste " + list.toString() +" \n");

		String text = "<dl>";

		if (list != null) {

			for (Object o : list) {
				text += "<dd>";

				text += HtmlFormatter.convertJavaToHtml(o.toString());
				text += "</dd>";

			}
		}

		text += "</dl>";
		print(text);
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

		message = "<strong>" + message + "</strong>";
		this.print(message);
	}

	@Override
	public void printEpic(String message) {

		message = "<div style=\"font-size:50px;width:100%; text-align: center;\"><strong>" + message + "</div>";
		this.print(message);
	}

	@Override
	public void printASCIIGraphics(ASCIIGraphics graphics) {
		this.print(HtmlFormatter.convertASCIIToHtml(graphics.toString()));

	}

}
