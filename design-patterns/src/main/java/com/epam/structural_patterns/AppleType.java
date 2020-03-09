package com.epam.structural_patterns;

public class AppleType implements Fruits{
	protected Fruits fruit;

	public AppleType(Fruits f){
		this.fruit= f;
	}



	public void vitamins() {
		this.fruit.vitamins();

	}

}
