import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UserView extends JPanel {
	private JTextField nameField;
	private JTextField passField;
	private JButton update;
	
	public UserView(UserModel model, UserController controller) {
		nameField = new JTextField();
		add(nameField);
		passField = new JTextField();
		add(passField);
		
		update = new JButton("Save");
		add(update);
		
		onModelChanged(model);
		update.addActionListener(controller);
	}

	public void onModelChanged(UserModel model) {
		nameField.setText(model.getName());
		passField.setText(model.getPass());
	}

	public JTextField getNameField() {
		return nameField;
	}

	public JTextField getPassField() {
		return passField;
	}
	
}
