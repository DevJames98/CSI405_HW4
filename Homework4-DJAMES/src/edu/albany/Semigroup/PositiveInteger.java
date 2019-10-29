package edu.albany.Semigroup;

//import edu.albany.BinaryWord.*;
//import edu.albany.Complementable.*;

public class PositiveInteger extends SemiGroup<PositiveInteger>{
	
	//Instance variable to store the positive integer
	private int positiveInt;
	
	//Create Default Constructor
	public PositiveInteger() {
		
		this.positiveInt = 0;
		
	}
	
	//Create Constructor with integer argument
	public PositiveInteger(int p) {
		
		//Converts negative to positive integers if necessary
		if(p < 0) {
			
			p = Math.abs(p);
			this.positiveInt = p;
			
		}
		else {
			
			this.positiveInt = p;
			
		}
		
		
	}
	
	//Getters and setters
	
	public int getPositiveInteger() {
		
		return positiveInt;
		
	}
	
	public void setPositiveInteger(int newPosInt) {
		
		positiveInt = newPosInt;
		
	}
	
	//Implement Operator method
	@Override
	public PositiveInteger Operator(PositiveInteger b) {
		
		PositiveInteger newInteger = new PositiveInteger(this.positiveInt + b.positiveInt);
		
		return newInteger;
		
	}
	
	//Implement toString method
	@Override
	public String toString() {
		
		String x = String.format("Positive Integer: %d", this.getPositiveInteger());
		
		return x;
		
	}
	
	//Implement equals method
	public boolean equals(PositiveInteger p) {
		
		if(this.positiveInt != p.positiveInt) {
			
			return false;
			
		}
		else {
			
			return true;
			
		}
		
	}
	
	
}
