package edu.albany.Semigroup;

import java.util.*;
import edu.albany.BinaryWord.*;
import edu.albany.Complementable.*;


public abstract class SemiGroup<T> {
	
	
	public abstract T Operator(T b);
	
	
	//Implement combine method
	public static <T> T combine(Collection <? extends SemiGroup<T>> list) {
		
		SemiGroup<T> temp = null;
		
		//Enhanced for loop to iterate through list
		for(SemiGroup<T> a: list) {
			if(temp != null) {
				
				temp = (SemiGroup<T>) temp.Operator((T) a);
				
			}
			else {
				
				temp = a;
			}
		}
		
		System.out.println(temp);
		
		return (T) temp;
		
	}
	
	
}
