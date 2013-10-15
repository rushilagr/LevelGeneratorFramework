package com.GetHigh;
public class StaticLevelGenerator extends LevelGenerator{

	public StaticLevelGenerator(int difficulty) {
		super(difficulty);
	}
	
	public Level generate(int length){
		Level lvl = new Level();
		
		for(int i=0; i<length; i++){
			Pattern p = get(rand.nextInt(size()));
			for(View v : p)
				lvl.add(v);
		}
		
		return lvl;
	}
	
}