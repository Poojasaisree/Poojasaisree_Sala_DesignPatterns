package com.epam.structural_patterns;

public class Rose extends Flowers{

	public Rose(Color c) {
		super(c);
		
	}
	
	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.print("Rose is ");
		color.getColor();
		
	}

}
