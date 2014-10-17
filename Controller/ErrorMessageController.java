package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Views.ErrorMessageView;

public class ErrorMessageController implements ActionListener
{
	ErrorMessageView view;
	
	public ErrorMessageController(String error) {
		this.view = new ErrorMessageView(error);
		this.view.ok.addActionListener(this);
	}
	
	public void close() {
		this.view.setVisible(false);
		this.view = null;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		this.close();
	}
}
