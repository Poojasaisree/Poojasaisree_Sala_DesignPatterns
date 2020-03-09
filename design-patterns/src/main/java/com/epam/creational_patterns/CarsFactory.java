package com.epam.creational_patterns;

public class CarsFactory {
	public Cars getCar(String carType){
	      if(carType == null){
	         return null;
	      }		
	      if(carType.equalsIgnoreCase("Sedan")){
	         return new Sedan();
	         
	      } else if(carType.equalsIgnoreCase("Swift")){
	         return new Swift();
	         
	      } else if(carType.equalsIgnoreCase("Ciaz")){
	         return new Ciaz();
	      }
	      
	      return null;
	   }

}
