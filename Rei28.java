import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Rei28Panel extends JPanel {
	public Rei28Panel() {
		setBackground(Color.yellow);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(0, 0, getWidth(), getHeight());
	}
}

class Rei28Frame extends JFrame {
	public Rei28Frame() {
		setSize(400, 300);
		setTitle("例題28");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.add(new Rei28Panel());
	}
}
public class Rei28 {
	public static void main(String[] args) {
		JFrame w = new Rei28Frame();
		w.setVisible(true);
	}
}

