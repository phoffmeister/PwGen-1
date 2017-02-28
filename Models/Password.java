package Models;

import java.util.ArrayList;
import java.util.Random;

public class Password
{
	private String text;
	private int length;
	private boolean upperCaseChars;
	private boolean lowerCaseChars;
	private boolean numbers;
	private boolean specialChars;
	private ArrayList<String> errors;
	private String exclude;

	public Password(int l, boolean ucc, boolean lcs, boolean n, boolean sc, String excl) {
		this.exclude = excl;
		this.length = l;
		this.upperCaseChars = ucc;
		this.lowerCaseChars = lcs;
		this.numbers = n;
		this.specialChars = sc;
		this.generate();
	}

	private void generate() {
		if(this.valid()) {
			String [] upperChars = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
			String [] lowerChars = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
			String [] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
			String [] specialChars = {"_", "-", "$", "%", "/", "+", "#", "(", ")"};
			String [][] chars = {upperChars, lowerChars, numbers, specialChars};
			this.text = "";
			Random random = new Random();
			while(text.length() < this.length) {
				int randomCategory = random.nextInt(chars.length);
				if((randomCategory == 0 && !this.upperCaseChars) || (randomCategory == 1 && !this.lowerCaseChars) || (randomCategory == 2 && !this.numbers) || (randomCategory == 3 && !this.specialChars))
					continue;
				String randomChar = "";
				do{
					randomChar = chars[randomCategory][random.nextInt(chars[randomCategory].length)];
				}while (this.exclude.contains(randomChar));
				this.text += randomChar;
			}
		}
	}

	public String getText() {
		return this.text;
	}

	public ArrayList<String> getErrors() {
		return this.errors;
	}

	public boolean valid() {
		this.errors = new ArrayList<String>();
		if(!this.upperCaseChars && !this.lowerCaseChars && !this.numbers && !this.specialChars)
			this.errors.add("Mindestens eine Zeichenkategorie muss ausgewählt werden");
		if(this.length < 1)
			this.errors.add("Die angegebene Länge ist ungültig");
		return this.errors.size() < 1;
	}
}
