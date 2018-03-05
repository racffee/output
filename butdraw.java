import java.awt.*;
import javax.swing.*;

class butdraw extends JFrame {
	public static void main(String[] args) {
		JFrame frame = new butdraw();
		//frame.getContentPane().setLayout(new FlowLayout());
		//frame.getContentPane().add(new JButton("Swing button"));

		frame.getRootPane().setVisible(false);
		frame.setBounds(0, 0, 400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		g.drawString("superman", 200, 200);
	}
}
