package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Models.Password;
import Views.MainView;

public class MainController implements ActionListener 
{
	MainView view;
	Password password;
	
	public MainController() {
		this.view = new MainView();
		this.view.go.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.password = new Password(Integer.valueOf(this.view.lengthTextField.getText()), this.view.upperCaseCharsCheckbox.isSelected(), this.view.lowerCaseCharsCheckbox.isSelected(), this.view.specialCharsCheckbox.isSelected());
		this.view.password.setText(this.password.getText());
	}
}