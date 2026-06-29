package com.wipro.bank.service;
import com.wipro.bank.acc.*;
import com.wipro.bank.exception.*;
public class BankService {
    public boolean validateData(float principal, int tenure, int age, String gender) {
        try {
            if (principal >= 500 && (tenure == 5 || tenure == 10) && (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) && age >= 1 && age <= 100) {
                return true;
            } else {
                throw new BankValidationException();
            }
        } catch (BankValidationException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public void calculate(float principal,int tenure,int age,String gender) {
        RDAccount rd = new RDAccount(principal, tenure);
        rd.setInterest(age, gender);
        float totalDeposit = rd.calculateAmountDeposited();
        float interest = rd.calculateInterest();
        float maturity = rd.calculateMaturityAmount(totalDeposit, interest);
        System.out.println("Total Amount Deposited : " + totalDeposit);
        System.out.println("Interest : " + interest);
        System.out.println("Maturity Amount : " + maturity);    }
}