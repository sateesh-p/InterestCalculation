package com.wipro.bank.exception;

public class BankValidationException extends Exception {
	
	public BankValidationException() {
		super();
	}

	public String toString(String s) {
		
		return "Invalid Data";
	}
}
