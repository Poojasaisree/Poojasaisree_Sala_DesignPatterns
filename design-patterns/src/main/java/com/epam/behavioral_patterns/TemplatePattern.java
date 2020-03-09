package com.epam.behavioral_patterns;

public class TemplatePattern {
	public static void main(String... args) {
		System.out.println("Process of Online order:");
		OrderTemplate onlineOrder = new OnlineOrder();
		onlineOrder.processOrder();
		System.out.println();
		System.out.println("Process of Store order:");
		OrderTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder();
	}
}


