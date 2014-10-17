package Models;

public class Password 
{
	String text;
	int length;
	boolean upperCaseChars;
	boolean lowerCaseChars;
	boolean specialChars;
	
	public Password(int l, boolean ucc, boolean lcs, boolean sc) {
		this.text = "";
		this.length = l;
		this.upperCaseChars = ucc;
		this.lowerCaseChars = lcs;
		this.specialChars = sc;
	}
}