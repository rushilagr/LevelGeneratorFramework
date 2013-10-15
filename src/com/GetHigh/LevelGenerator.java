/**
 * Base class for generating Level layouts
 */
package com.GetHigh;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class LevelGenerator extends Vector<Pattern>
{
	
	private int difficulty;
	protected Random rand;
	
	public LevelGenerator(int difficulty){
		super(1,1);
		this.difficulty = difficulty;
		this.rand = new Random();
	}
	
	@Override
	public boolean add(Pattern p){
		if(p.getDifficulty() != difficulty)
			return false;
		
		return super.add(p);
	}
	
	public int getDifficulty(){
		return difficulty;
	}
	
	public void setDifficulty(int difficulty){
		this.difficulty = difficulty;
	}
	
}