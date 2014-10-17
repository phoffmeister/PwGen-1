package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ErrorMessageView extends JFrame {
	
	private JPanel content;
	private JLabel errorMessage;
	public JButton ok;
	
	public ErrorMessageView(String error) {
		super("Fehler");
		
		this.errorMessage = new JLabel(error);
		this.errorMessage.setHorizontalAlignment(SwingConstants.CENTER);
		this.errorMessage.setForeground(Color.red);
		this.errorMessage.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		this.ok = new JButton("ok");
		
		this.content = new JPanel(new BorderLayout());
		this.content.add(this.errorMessage, BorderLayout.CENTER);
		this.content.add(this.ok, BorderLayout.SOUTH);
		
		this.add(this.content);
		this.setSize(this.errorMessage.getPreferredSize().width+25, this.errorMessage.getPreferredSize().height+55);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setAlwaysOnTop(true);
	}
}