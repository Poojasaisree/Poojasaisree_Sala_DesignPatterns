package com.epam.structural_patterns;

public class Hibiscus extends Flowers {

	public Hibiscus(Color c) {
		super(c);
		
	}

	@Override
	public void getColor() {
		System.out.print("Hibiscus is ");
		color.getColor();
		
	}

}
