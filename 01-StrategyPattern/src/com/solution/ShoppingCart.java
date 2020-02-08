package com.solution;

public class ShoppingCart {
	
	//List of items
	private Item item;
	
	private PaymentStrategy paymentStrategy;
	
	private String arg;

	public ShoppingCart(Item item, PaymentStrategy paymentStrategy,  String arg) {
		super();
		this.item = item;
		this.arg = arg;
		this.paymentStrategy = paymentStrategy;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public PaymentStrategy getPaymentStrategy() {
		return paymentStrategy;
	}

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public String getArg() {
		return arg;
	}

	public void setArg(String arg) {
		this.arg = arg;
	}

	public void pay() {
		paymentStrategy.pay(item, arg);
	}

	
	public void cancel() {
		paymentStrategy.cancel();
	}
	
}
