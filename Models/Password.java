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
	
	public Password(int l, boolean ucc, boolean lcs, boolean n, boolean sc) {
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
			while(text.length() < this.length) {
				Random random = new Random();
				int randomCategory = random.nextInt(chars.length);
				if((randomCategory == 0 && !this.upperCaseChars) || (randomCategory == 1 && !this.lowerCaseChars) || (randomCategory == 2 && !this.numbers) || (randomCategory == 3 && !this.specialChars))
					continue;
				random = new Random();
				int randomChar = random.nextInt(chars[randomCategory].length);
				this.text += chars[randomCategory][randomChar];
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
			this.errors.add("Mindestens eine Zeichenkategorie muss ausgew�hlt werden");
		if(this.length < 1)
			this.errors.add("Die angegebene L�nge ist ung�ltig");
		return this.errors.size() < 1;
	}
}