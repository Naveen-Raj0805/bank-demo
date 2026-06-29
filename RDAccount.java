package com.wipro.bank.acc;

public class RDAccount extends Account{

	public RDAccount(float principal, int tenure) {
	    this.principal = principal;
	    this.tenure = tenure;
	}
	@Override
	public float calculateInterest() {
	    float totalInterest = 0;
	    float r = rateOfInterest / 100;
	    int months = tenure * 12;
	    for (int i = 0; i < months; i++) {
	        int remainingMonths = months - i;
	        float interest = principal * r * remainingMonths / 12;
	        totalInterest += interest;
	    }
	    return totalInterest;
	}
	
	@Override
	public float calculateAmountDeposited() {
		return principal*tenure*12;
	}

}
