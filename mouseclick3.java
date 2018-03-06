import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mouseclick3 extends JFrame implements MouseListener {
	public static void main(String[] args) {
		JFrame frame = new mouseclick3();
		frame.getRootPane().setVisible(false);
		frame.setBounds(0, 0, 600, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public mouseclick3() { addMouseListener(this); }
	private int x = 0, y = 0;

	public void paint(Graphics g) {
		g.drawString("test", 100, 100);
		g.drawRect(x-50, y-50, 30, 30);
	}

	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void mouseReleased(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void mouseEntered(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void mouseExited(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}
}
