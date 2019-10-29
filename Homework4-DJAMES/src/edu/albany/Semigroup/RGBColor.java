package edu.albany.Semigroup;

import edu.albany.BinaryWord.*;
import edu.albany.Complementable.*;



public class RGBColor extends SemiGroup<RGBColor> implements Complementable {
	
	//Create instance variables to store rgb color values
	private int red;
	private int green;
	private int blue;
	
	//Create Default Constructor
	public RGBColor() {
		
		red = 0;
		green = 0;
		blue = 0;
		
	}
	
	//Create Constructor using 3 RGB arguments
	public RGBColor(int r, int g, int b) {
		
		//Checks to see if each variable is within range. If not, sets to 0
		if(r >= 0 && r <= 255) {
			
			this.red = r;
			
		}
		else if(r > 255 || r < 0) {
			
			this.red = 0;
			
		}
		
		if(g >= 0 && g <= 255) {
					
			this.green = g;
					
		}
		else if(r > 255 || r < 0) {
					
			this.green = 0;
					
		}
				
		if(b >= 0 && b <= 255) {
					
			this.blue = b;
					
		}
		else if(r > 255 || r < 0) {
					
			this.blue = 0;
					
		}
				
	
		
	}
	
	//Getters and Setters
	public int getRed() {
		
		return red;
		
	}
	
	public void setRed(int r) {
		
		red = r;
		
	}
	
	public int getGreen() {
			
			return green;
			
		}
		
		public void setGreen(int g) {
			
			green = g;
			
		}
		
	public int getBlue() {
			
			return blue;
			
		}
		
	public void setBlue(int b) {
			
			blue = b;
			
		}
	
	
	
	//Implement Complement method
	public RGBColor Complement() {
		
		//Variable to store the new color that is returned
		RGBColor newColor;
		
		//Variables used to store each respective RGB value
		int x,y,z;
		
		//Does complement for each respective RGB value and stores it into variables
		x = 255 - this.red;
		y = 255 - this.green;
		z = 255 - this.blue;
		
		//Creates new RGBColor with complemented values
		newColor = new RGBColor(x,y,z);
		
		//Print
		System.out.println("RGB COMPLEMENT\nRed: " + newColor.getRed() + "\nGreen: " + newColor.getGreen() + "\nBlue: " + newColor.getBlue());
		
		return newColor;
		
	}
	
	
	//Implement Operator method
	@Override
	public RGBColor Operator(RGBColor color) {
		
		//Variables to store new RGB values
		int x,y,z;
		//Creates new RGB color which will be returned
		RGBColor temp;
		
		//Does operator for each respective RGB value and stores it into variables
		x = (this.red + color.red) / 2;
		y = (this.green + color.green) / 2;
		z = (this.blue + color.blue) / 2;
		
		//Creates new RGBColor with Operator values
		temp = new RGBColor(x,y,z);
		
		
		return temp;
		
		}
	
	@Override
	public String toString() {
		
		String x = "RGB COMBINE\nRed: " + this.getRed() + "\nGreen: " + this.getGreen() + "\nBlue: " + this.getBlue();
		
		return x;
		
	}
	
}
