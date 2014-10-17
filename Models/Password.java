package Models;

import java.util.Random;

public class Password 
{
	private String text;
	private int length;
	private boolean upperCaseChars;
	private boolean lowerCaseChars;
	private boolean specialChars;
	
	public Password(int l, boolean ucc, boolean lcs, boolean sc) {
		this.length = l;
		this.upperCaseChars = ucc;
		this.lowerCaseChars = lcs;
		this.specialChars = sc;
		this.generate();
	}
	
	private void generate() {
		String [] upperChars = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String [] lowerChars = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String [] specialChars = {"_", "-", "$", "%", "/", "+", "#", "(", ")"};
		String [][] chars = {upperChars, lowerChars, specialChars};
		this.text = "";
		while(text.length() < this.length) {
			Random random = new Random();
			int randomCategory = random.nextInt(chars.length);
			if((randomCategory == 0 && !this.upperCaseChars) || (randomCategory == 1 && !this.lowerCaseChars) || (randomCategory == 2 && !this.specialChars))
				continue;
			random = new Random();
			int randomChar = random.nextInt(chars[randomCategory].length);
			this.text += chars[randomCategory][randomChar];
		}
	}
	
	public String getText() {
		return this.text;
	}
}