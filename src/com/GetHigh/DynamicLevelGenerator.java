package com.GetHigh;
import java.util.Iterator;

public class DynamicLevelGenerator extends LevelGenerator
								   implements Iterator<Pattern>
{
	
	public DynamicLevelGenerator(int difficulty) {
		super(difficulty);
	}

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Pattern next() {
		return get(rand.nextInt(size()));
	}

	@Override
	public void remove() {
		System.err.println("WARNING: remove() in LevelGenerator is not a supported operation.");
	}

}
