package com.GetHigh;
import java.util.Vector;

/**
 * Dictates layout of a Level.
 * Collection of Views which appear sequentially
 * Order of Views(List) important
 * 
 * Write modularity contract
 */
public class Pattern extends Vector<View> {
	
	public Pattern() {
		super(1,1);
	}
	
	public int getDifficulty() {
		int sum=0;
		
		for(View v : this)
			sum+=v.getDifficulty();
		
		return sum/size();
	}
	
}