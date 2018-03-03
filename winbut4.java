import java.awt.*;
import javax.swing.*;

class winbut4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("sample");

		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(new JButton("swing JButton"));
		frame.getContentPane().add(new Button("AWT Button"));

		frame.setBounds(0, 0, 400, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
