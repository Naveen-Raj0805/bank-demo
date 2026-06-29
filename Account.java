package com.wipro.bank.acc;

public abstract class Account {
	int tenure;
	float principal;
	float rateOfInterest;

	public float setInterest(int age, String gender) {
	    if (gender.equalsIgnoreCase("Male")) {
	        if (age < 60)
	            rateOfInterest = 9.8f;
	        else
	            rateOfInterest = 10.5f;
	    }
	    else if (gender.equalsIgnoreCase("Female")) {
	        if (age < 58)
	            rateOfInterest = 10.2f;
	        else
	            rateOfInterest = 10.8f;
	    }
	    return rateOfInterest;
	}
	public abstract float calculateInterest();
	public abstract float calculateAmountDeposited();
	public float calculateMaturityAmount(float totalPrincipeDeposited,float maturityInterest) {
		return totalPrincipeDeposited+maturityInterest;
	}
}

