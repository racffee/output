import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class typinggame extends JFrame implements KeyListener {
	public static void main(String[] args) {
		JFrame frame = new typinggame("Typing Game!");
		frame.setBounds(0, 0, 600, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JLabel label;
	private Random random;
	private String[] words = {"help", "me", "suprise"};

	public typinggame(String title) {
		super(title);

		random = new Random(System.currentTimeMillis());
		label = new JLabel(words[random.nextInt(words.length)]);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);

		getContentPane().add(label);
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {
		String text = label.getText();
		if (text.charAt(0) == e.getKeyChar()) {
			if (text.length() > 1) {
				label.setText(text.substring(1));
			}
			else label.setText(words[random.nextInt(words.length)]);
		}
		repaint();
	}
}		
