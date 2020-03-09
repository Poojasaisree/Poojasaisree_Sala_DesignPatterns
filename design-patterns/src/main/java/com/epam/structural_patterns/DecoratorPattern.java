package com.epam.structural_patterns;

public class DecoratorPattern {

	public static void main(String[] args) {
		Fruits redApple = new RedApple(new Apples());
		redApple.vitamins();
		System.out.println();
		
		Fruits apples = new RedApple(new GreenApple(new Apples()));
		apples.vitamins();

	}

}
