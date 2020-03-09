package com.epam.behavioral_patterns;

public class StoreOrder extends OrderTemplate {

	@Override
	public void doSelect() {
		// TODO Auto-generated method stub
		System.out.println("Customer chooses the item directly fronm the store.");
		
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Pays at counter through cash");
		
	}

	@Override
	public void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Collect the item  in delivery counter.");
		
	}

}
