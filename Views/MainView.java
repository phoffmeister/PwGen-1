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
	public JCheckBox numbersCheckbox;
	public JCheckBox specialCharsCheckbox;
	public JTextField lengthTextField;
	private JLabel lengthLabel;
	public JTextField excludeCharacterField;
	public JLabel excludeLabel;
	public JTextField password;
	public JButton go;

	public MainView() {
		super("PwGen");
		this.setSize(400, 160);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		this.layout = new SpringLayout();
		this.contentPane = this.getContentPane();
		this.contentPane.setLayout(this.layout);

		this.upperCaseCharsCheckbox = new JCheckBox("Großbuchstaben", true);
		this.lowerCaseCharsCheckbox = new JCheckBox("Kleinbuchstaben", true);
		this.numbersCheckbox = new JCheckBox("Zahlen", true);
		this.specialCharsCheckbox = new JCheckBox("Sonderzeichen");

		this.lengthTextField = new JTextField("8", 5);
		this.lengthLabel = new JLabel("Länge");

		this.excludeCharacterField = new JTextField("iIl10O", 5);
		this.excludeLabel = new JLabel("Ausschließen");

		this.password = new JTextField(28);
		this.go = new JButton("Los");

		this.contentPane.add(this.upperCaseCharsCheckbox);
		this.contentPane.add(this.lowerCaseCharsCheckbox);
		this.contentPane.add(this.numbersCheckbox);
		this.contentPane.add(this.specialCharsCheckbox);
		this.contentPane.add(this.lengthLabel);
		this.contentPane.add(this.lengthTextField);
		this.contentPane.add(this.excludeCharacterField);
		this.contentPane.add(this.excludeLabel);
		this.contentPane.add(this.password);
		this.contentPane.add(this.go);

		this.layout.putConstraint(SpringLayout.WEST, this.upperCaseCharsCheckbox, 10, SpringLayout.WEST, this.contentPane);
		this.layout.putConstraint(SpringLayout.NORTH, this.upperCaseCharsCheckbox, 5, SpringLayout.NORTH, this.contentPane);

		this.layout.putConstraint(SpringLayout.WEST, this.lowerCaseCharsCheckbox, 200, SpringLayout.WEST, this.contentPane);
		this.layout.putConstraint(SpringLayout.NORTH, this.lowerCaseCharsCheckbox, 5, SpringLayout.NORTH, this.contentPane);

		this.layout.putConstraint(SpringLayout.WEST, this.numbersCheckbox, 0, SpringLayout.WEST, this.upperCaseCharsCheckbox);
		this.layout.putConstraint(SpringLayout.NORTH, this.numbersCheckbox, 5, SpringLayout.SOUTH, this.upperCaseCharsCheckbox);

		this.layout.putConstraint(SpringLayout.WEST, this.specialCharsCheckbox, 0, SpringLayout.WEST, this.lowerCaseCharsCheckbox);
		this.layout.putConstraint(SpringLayout.NORTH, this.specialCharsCheckbox, 5, SpringLayout.SOUTH, this.lowerCaseCharsCheckbox);

		this.layout.putConstraint(SpringLayout.WEST, this.excludeLabel, 0, SpringLayout.WEST, this.upperCaseCharsCheckbox);
		this.layout.putConstraint(SpringLayout.NORTH, this.excludeLabel, 5, SpringLayout.SOUTH, this.numbersCheckbox);

		this.layout.putConstraint(SpringLayout.WEST, this.excludeCharacterField, 5, SpringLayout.EAST, this.excludeLabel);
		this.layout.putConstraint(SpringLayout.NORTH, this.excludeCharacterField, 0, SpringLayout.NORTH, this.excludeLabel);

		this.layout.putConstraint(SpringLayout.WEST, this.lengthLabel, 0, SpringLayout.WEST, this.upperCaseCharsCheckbox);
		this.layout.putConstraint(SpringLayout.NORTH, this.lengthLabel, 5, SpringLayout.SOUTH, this.excludeLabel);

		this.layout.putConstraint(SpringLayout.WEST, this.lengthTextField, 0, SpringLayout.WEST, this.excludeCharacterField);
		this.layout.putConstraint(SpringLayout.NORTH, this.lengthTextField, 0, SpringLayout.NORTH, this.lengthLabel);

		this.layout.putConstraint(SpringLayout.WEST, this.password, 0, SpringLayout.WEST, this.lengthLabel);
		this.layout.putConstraint(SpringLayout.NORTH, this.password, 5, SpringLayout.SOUTH, this.lengthLabel);

		this.layout.putConstraint(SpringLayout.WEST, this.go, 3, SpringLayout.EAST, this.password);
		this.layout.putConstraint(SpringLayout.NORTH, this.go, 0, SpringLayout.NORTH, this.password);

		this.setVisible(true);
	}
}
