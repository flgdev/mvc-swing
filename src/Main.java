import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Main extends JFrame {
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		setSize(400, 400);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		setVisible(true);
		new UserController(new UserModel("abcabcabc", "defdefdef"), this);
		SwingUtilities.updateComponentTreeUI(this);
	}
}