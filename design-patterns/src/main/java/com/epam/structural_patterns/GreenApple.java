package com.epam.structural_patterns;

public class GreenApple extends AppleType{

	public GreenApple(Fruits f) {
		super(f);
		
	}
	
	public void vitamins() {
		super.vitamins();
		System.out.println("Green apples contain vitamin C.");
	}

}
