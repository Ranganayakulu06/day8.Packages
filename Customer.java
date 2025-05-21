package com.bank.customers;

public class Customer {
	private String customerName;
	private int customerId;
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getcustomerNamer() {
		return customerName;
	}
	
	public double getcustomerId() {
		return customerId;
	}
	
	public void showCustomerDetails() {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Id: " + customerId);
	}


}
