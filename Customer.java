package com.refactor;

public class Customer {
	String name;
	String type;
	double discount;

	public Customer(String name, String type) {
		this.name = name;
		this.type = type;
		setDiscount();
	}
	
	private void setDiscount() {
	    switch (type.toUpperCase()) {
	        case RefactorConstants.CUSTOMER_TYPE_REGULAR -> discount = 0.05;
	        case RefactorConstants.CUSTOMER_TYPE_VIP -> discount = 0.1;
	        case RefactorConstants.CUSTOMER_TYPE_PREMIUM -> discount = 0.2;
	        default -> discount = 0.0; 
	    }
	}
}
