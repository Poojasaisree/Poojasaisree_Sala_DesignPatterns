package com.epam.behavioral_patterns;

public abstract class OrderTemplate {
	public boolean isGift;

	public abstract void doSelect();

	public abstract void doPayment();

	public final void giftWrap() {
		System.out.println("Gift wrap done.");
	}

	public abstract void doDelivery();

	public final void processOrder() {
		doSelect();
		doPayment();
		if (isGift) {
			giftWrap();
		}
		doDelivery();
	}

}
