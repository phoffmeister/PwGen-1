package Views;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MainView extends JFrame 
{
	private SpringLayout layout;
	private Container contentPane;
	public JCheckBox upperCaseCharsCheckbox;
	public JCheckBox lowerCaseCharsCheckbox;
	public JCheckBox specialCharsCheckbox;
	public JTextField lengthTextField;
	private JLabel lengthLabel;
	public JTextField password;
	public JButton go;
	
	public MainView() {
		super("PwGen");
		this.setSize(380, 130);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.layout = new SpringLayout();
		this.contentPane = this.getContentPane();
		this.contentPane.setLayout(this.layout);
		
		this.upperCaseCharsCheckbox = new JCheckBox("Gro§Ÿbuchstaben", true);
		this.lowerCaseCharsCheckbox = new JCheckBox("Kleinbuchstaben", true);
		this.specialCharsCheckbox = new JCheckBox("Sonderzeichen");
		
		this.lengthTextField = new JTextField("8", 5);
		this.lengthLabel = new JLabel("LŠnge");
		
		this.password = new JTextField(20);
		this.go = new JButton("Los");
		
		this.contentPane.add(this.upperCaseCharsCheckbox);
		this.contentPane.add(this.lowerCaseCharsCheckbox);
		this.contentPane.add(this.specialCharsCheckbox);
		this.contentPane.add(this.lengthLabel);
		this.contentPane.add(this.lengthTextField);
		this.contentPane.add(this.password);
		this.contentPane.add(this.go);
		
	    this.layout.putConstraint(SpringLayout.WEST, this.upperCaseCharsCheckbox, 10, SpringLayout.WEST, this.contentPane);
	    this.layout.putConstraint(SpringLayout.NORTH, this.upperCaseCharsCheckbox, 5, SpringLayout.WEST, this.contentPane);
	    
	    this.layout.putConstraint(SpringLayout.WEST, this.lowerCaseCharsCheckbox, 200, SpringLayout.WEST, this.contentPane);
	    this.layout.putConstraint(SpringLayout.NORTH, this.lowerCaseCharsCheckbox, 5, SpringLayout.WEST, this.contentPane);
	    
	    this.layout.putConstraint(SpringLayout.WEST, this.specialCharsCheckbox, 10, SpringLayout.WEST, this.contentPane);
	    this.layout.putConstraint(SpringLayout.NORTH, this.specialCharsCheckbox, 30, SpringLayout.WEST, this.contentPane);
	    
	    this.layout.putConstraint(SpringLayout.WEST, this.lengthLabel, 205, SpringLayout.WEST, this.contentPane);
	    this.layout.putConstraint(SpringLayout.NORTH, this.lengthLabel, 34, SpringLayout.WEST, this.contentPane);
	    
	    this.layout.putConstraint(SpringLayout.WEST, this.lengthTextField, 253, SpringLayout.WEST, this.contentPane);
	    this.layout.putConstraint(SpringLayout.NORTH, this.lengthTextField, 29, SpringLayout.WEST, this.contentPane);
	    
	    this.layout.putConstraint(SpringLayout.WEST, this.password, 12, SpringLayout.WEST, this.contentPane);
	    this.layout.putConstraint(SpringLayout.NORTH, this.password, 66, SpringLayout.WEST, this.contentPane);
	    
	    this.layout.putConstraint(SpringLayout.WEST, this.go, 285, SpringLayout.WEST, this.contentPane);
	    this.layout.putConstraint(SpringLayout.NORTH, this.go, 67, SpringLayout.WEST, this.contentPane);

		this.setVisible(true);
	}
}