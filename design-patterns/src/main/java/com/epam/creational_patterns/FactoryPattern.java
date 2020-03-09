package com.epam.creational_patterns;

public class FactoryPattern {
	public static void main(String[] args) {
	      CarsFactory carsFactory = new CarsFactory();

	      
	      Cars car1 = carsFactory.getCar("Sedan");

	      car1.book();
	     
	      
	      Cars car2 = carsFactory.getCar("Swift");

	      
	      car2.book();
	      
	      
	      Cars car3 = carsFactory.getCar("Sedan");

	      car3.book();
	      
	   }

}
