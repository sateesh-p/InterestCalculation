package com.wipro.bank.acc;
import java.util.*;

public class RDAccount extends Account {
	int tenure;
	float principal;
	
	public RDAccount(int tenure,float principal){
		this.tenure=tenure;
		this.principal=principal;
		
	}

	
	public  float calculateAmountDeposited() {
		return principal*tenure*12;
		
		
	}
public float calculateInterest() {
	float Interest=0.0f;
	int tn=tenure*12;
	float r=rateOfInterest/100;
	int n=4;
	for(int i=0;i<tn;i++)
	{
		
		Interest+=principal*(float)(Math.pow(1+(r/n),n*((tn-i)/12.0))-1);
		
	}
	
	return Interest;
			
	}

}
