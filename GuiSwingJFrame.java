import javax.swing.JFrame;

public class GuiSwingJFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JFrame window");
		frame.setBounds(100, 100, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
