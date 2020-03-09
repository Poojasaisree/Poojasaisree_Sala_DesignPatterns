package com.epam.structural_patterns;

public class BridgePattern {
	public static void main(String[] args) {
		Flowers hib = new Hibiscus(new RedColor());
		hib.getColor();
		
		Flowers rose = new Rose(new PinkColor());
		rose.getColor();
	}

}
