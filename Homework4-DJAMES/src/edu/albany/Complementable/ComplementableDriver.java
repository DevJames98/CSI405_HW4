package edu.albany.Complementable;

import edu.albany.BinaryWord.*;
//import edu.albany.Complementable.*;
import edu.albany.Semigroup.*;
//import edu.al
import java.util.*;

public class ComplementableDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryWord s = new BinaryWord("001011");
		BinaryWord t = new BinaryWord("001011");
		
		//T x = s.Complement();
	
		//System.out.println(s.word + "\n" + s.Complement());
		
		s.toString(s);
		System.out.println(s.equals(t));
		
		PositiveInteger a = new PositiveInteger(1);
		PositiveInteger b = new PositiveInteger(4);
		
		PositiveInteger c = a.Operator(b);
		PositiveInteger d = new PositiveInteger(-25);
		System.out.println(c.getPositiveInteger());
		System.out.println(a.equals(b));
		System.out.println(d.getPositiveInteger());
		
		RGBColor color1 = new RGBColor(32,96,128);
		RGBColor color2 = new RGBColor(0,99,255);
		
		color1.Complement();
		color1.Operator(color2);
		
		
		ArrayList<PositiveInteger> posList = new ArrayList<>();
		ArrayList<RGBColor> rgbList = new ArrayList<>();

		
		posList.add(a);
		posList.add(b);
		posList.add(c);
		posList.add(d);
		
		rgbList.add(color1);
		rgbList.add(color2);

		
		
		
		SemiGroup.combine(posList);
		SemiGroup.combine(rgbList);
		
		
	}

}
