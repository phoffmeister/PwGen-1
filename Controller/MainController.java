package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import Models.Password;
import Views.MainView;

public class MainController implements ActionListener
{
	MainView view;
	Password password;

	public MainController() {
		this.view = new MainView();
		this.view.go.setActionCommand("go");
		this.view.go.addActionListener(this);
	}

	public void showNewPassword() {
		int length;
		if(this.view.lengthTextField.getText().equals(""))
			length = 0;
		else
			length = Integer.valueOf(this.view.lengthTextField.getText());
		boolean upperCaseChars = this.view.upperCaseCharsCheckbox.isSelected();
		boolean lowerCaseChars = this.view.lowerCaseCharsCheckbox.isSelected();
		boolean numbers = this.view.numbersCheckbox.isSelected();
		boolean specialChars = this.view.specialCharsCheckbox.isSelected();
		String excludeChars = this.view.excludeCharacterField.getText();
		this.password = new Password(length, upperCaseChars, lowerCaseChars, numbers, specialChars, excludeChars);
		if(this.password.valid())
			this.view.password.setText(this.password.getText());
		else
			new ErrorMessageController(this.password.getErrors().get(0));
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getActionCommand().equals("go"))
			this.showNewPassword();
	}
}
