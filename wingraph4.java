import java.awt.*;
import javax.swing.*;

class wingraph4 extends JFrame {
	public static void main(String[] args) {
		JFrame frame = new wingraph4();
		frame.getRootPane().setVisible(false);
		frame.setBounds(0, 0, 400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		g.drawRect(40, 40, 60, 60);
	}
}
