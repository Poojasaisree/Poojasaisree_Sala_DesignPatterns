package com.epam.behavioral_patterns;

public class OnlineOrder extends OrderTemplate{

	@Override
	public void doSelect() {
		// TODO Auto-generated method stub
		System.out.println("Select the Item added to online shopping cart,");
		System.out.println("Gift wrap (according to the preference),");
		System.out.println("Select the delivery address.");
		
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Online Payment through Netbanking/Cards.");
		
		
	}

	@Override
	public void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Ship the item tot he speciic address");
		
	}

}
