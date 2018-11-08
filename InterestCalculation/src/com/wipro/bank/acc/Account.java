package com.wipro.bank.acc;

abstract public class Account {
	int tenure;
	float principle;
	float rateOfInterest;
	public void setInterest(int age, String gender) {
		if(age<60&&gender.equalsIgnoreCase("Male")) {
			rateOfInterest=9.8f;
		}
		else if(age>=60&&gender.equalsIgnoreCase("Male")) {
			rateOfInterest=10.5f;
		}
		else if(age<58&&gender.equalsIgnoreCase("Female")) {
			rateOfInterest=10.2f;
		}
		else if(age>=58&&gender.equalsIgnoreCase("Female")) {
			rateOfInterest=10.8f;
		}
	}
	public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest) {
		
		
		return totalPrincipleDeposited+maturityInterest;
		
	}
	public abstract float calculateInterest();
	public abstract float calculateAmountDeposited();

}
