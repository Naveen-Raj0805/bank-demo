package com.wipro.bank.main;
import java.util.Scanner;
import com.wipro.bank.service.BankService;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int tenure=sc.nextInt();
		float principal=sc.nextFloat();
		int age=sc.nextInt();
		sc.nextLine();
		String gender = sc.nextLine();
		BankService bs= new BankService();
		if (bs.validateData(principal, tenure, age, gender)) {
            bs.calculate(principal, tenure, age, gender);
        }
	}
}
