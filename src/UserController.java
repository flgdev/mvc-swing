import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class UserController implements ActionListener{
	private UserModel model;
	private UserView view;

	public UserController(UserModel model, JFrame parent) {
		this.model = model;
		view = new UserView(model, this);
		parent.add(view);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		model.setName(view.getNameField().getText());
		model.setPass(view.getPassField().getText());
		view.onModelChanged(model);
	}
	
}
