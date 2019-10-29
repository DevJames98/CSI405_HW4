package edu.albany.BinaryWord;

//Import  java.util.BitSet
//import  java.util.BitSet;
import java.lang.StringBuilder;
import edu.albany.Complementable.*;

//Implements Complementable interface
public class BinaryWord implements Complementable<String>{
	
	//Creates instance variable to store the binary word
	private String word;
	private String complement;
	
	//Create Default Constructor
	public BinaryWord() {
		
		//this.word = "";
		//this.complement = ";
		
	}
	
	//Create Constructor
	public BinaryWord(String word) {
		
		//this.word = word;
		setWord(word);
		setComplement(this.Complement());
		//this.Complement();
		
	}
	
	//Getters and Setters
	public String getWord() {
		
		return word;
		
	}
	
	public void setWord(String newWord) {
		
		word = newWord;
	}
	
	public String getComplement() {
		
		return complement;
		
	}
	
	public void setComplement(String newComplement) {
		
		complement = newComplement;
		
	}
	
	
	//Implements Complement method from interface
	@Override
	public String Complement(){
		
		//Gets the word
		//String currentWord = this.word;
		String currentWord = this.getWord();
		String convertWordToString = currentWord.toString();
		
		//T [] binaryArray = new T[convertWordToString.length()];
	
		//Makes StringBuilder to store the complemented words (appended to in for loop)
		StringBuilder complementString = new StringBuilder("");
		
			
		//Appends complemented characters while going through each character in the BinaryWord
		
		for (char s: convertWordToString.toCharArray()) {
		
			if(s == '0') {
				
				//appends opposite character
				complementString.append('1');
					
			}
			
			else if (s == '1') {

				//appends opposite character
				complementString.append('0');
					
			}
				
			else {
				
				//Displays error message
				System.out.println("ERROR READING WORD");
				
			}
			
		} //END FOR LOOP
		
		//BinaryWord<T> complement = new BinaryWord<T>();
		//complement.setWord((T) complementString.toString());
		String comp = complementString.toString();
		
		//clear the Stringbuffer content
		complementString.delete(0, complementString.length());
		
		return comp;

	} //END COMPLEMENT OPERATION
	
	
	//Implement toString method
	public void toString(BinaryWord b) {
		
		//Prints the word and its complement
		System.out.println("Binary Word: " + b.getWord() + "\nComplement: " + b.Complement());
		
	}
	
	//Implement equals method
	public boolean equals(BinaryWord b) {
		
		String word1 = this.getWord();
		String word2 = b.getWord();
		
		if(word1.compareTo(word2) != 0) {
			
			return false;
		}
		
		else {
			
			return true;
		}
		
	}
	
}
