package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import Models.Password;
import Views.MainView;

public class MainController implements ActionListener, KeyListener
{
	MainView view;
	Password password;
	
	public MainController() {
		this.view = new MainView();
		this.view.lengthTextField.addKeyListener(this);
		this.view.go.setActionCommand("go");
		this.view.go.addActionListener(this);
	}
	
	public void showNewPassword() {
	    int length = Integer.valueOf(this.view.lengthTextField.getText());
	    boolean upperCaseChars = this.view.upperCaseCharsCheckbox.isSelected();
	    boolean lowerCaseChars = this.view.lowerCaseCharsCheckbox.isSelected();
	    boolean numbers = this.view.numbersCheckbox.isSelected();
	    boolean specialChars = this.view.specialCharsCheckbox.isSelected();
		this.password = new Password(length, upperCaseChars, lowerCaseChars, numbers, specialChars);
		if(this.password.valid())
			this.view.password.setText(this.password.getText());
		else
			new ErrorMessageController(this.password.getErrors().get(0));
	}
	
	public void formatLength() {
		String length = this.view.lengthTextField.getText();
		try {
			Integer.valueOf(length);
			if(length.length()>3)
				throw new Exception();
		}
		catch(Exception e) {
			this.view.lengthTextField.setText(length.substring(0, length.length()-1));
		}
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getActionCommand().equals("go"))
			this.showNewPassword();
	}
	
	@Override
	public void keyReleased(KeyEvent evt) {
		if(evt.getSource() == this.view.lengthTextField)
			this.formatLength();
	}

	@Override
	public void keyPressed(KeyEvent evt) { }

	@Override
	public void keyTyped(KeyEvent evt) { }
}