package com.epam.structural_patterns;

public class RedApple extends AppleType {

	public RedApple(Fruits f) {
		super(f);
		
	}
	public void vitamins() {
		super.vitamins();
		System.out.println("Red apples contain vitamin A.");
	}

}
