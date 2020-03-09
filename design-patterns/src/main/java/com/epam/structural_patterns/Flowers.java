package com.epam.structural_patterns;

public abstract class Flowers {
	protected Color color;

	//constructor with implementor as input argument
	public Flowers(Color c){
		this.color=c;
	}

	abstract public void getColor();

}
