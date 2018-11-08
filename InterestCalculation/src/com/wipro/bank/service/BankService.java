package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {
	public boolean validateData(float principal, int tenure,int age, String gender) {
		try {
	
		if((tenure==5||tenure==10)&&principal>=500&&(age>=1&&age<=100)&&(gender.toLowerCase()=="female"||gender.toLowerCase()=="male")) {
			return true;
		}
		else {
			throw new BankValidationException();
		}
		}catch(BankValidationException e) {
			System.out.println(e);
			return false;
		}
		
	}
	public void calculate(float principal,int tenure, int age, String gender) {
		if(validateData(principal,tenure,age,gender)) {
			RDAccount r=new RDAccount(tenure,principal);
			
			r.setInterest(age, gender);
			System.out.println("TotalAmountDeposited: "+r.calculateAmountDeposited());
			System.out.println("Interest: "+r.calculateInterest());
			System.out.println("Maturity interest: "+(r.calculateAmountDeposited()+r.calculateInterest()));
			
		}
		
		
	}

}
