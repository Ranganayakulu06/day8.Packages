package com.bank.app;

import com.bank.accounts.BankAccount;
import com.bank.customers.Customer;

public class BankApp {
	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountNumber("IFSA123456");
		bankAccount.setBalance(10000);
		
		Customer customer = new Customer();
		customer.setCustomerName("Ranganayakulu");
		customer.setCustomerId(123456);
		
		bankAccount.showAccountDetails();
		System.out.println();
		customer.showCustomerDetails();
	}
}
