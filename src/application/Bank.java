package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountBank;

public class Bank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AccountBank accountBank;
		
		double deposit, withdraw; 
		int number;
		String name;
		
		System.out.print("Enter account holder: ");
		name = sc.nextLine();
		
		System.out.print("Enter account number: ");
		number = sc.nextInt();
		
		System.out.print("\nIs there an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		accountBank = new AccountBank();
		
		if (resp == 'y') {
			System.out.print("Enter a deposit value: ");
			deposit = sc.nextDouble();
			accountBank = new AccountBank(name, number, deposit);
		}
		else {
			accountBank = new AccountBank(name, number);
		}
		
		System.out.println("\nAccount data:\n" + accountBank.toString());
		
		System.out.print("\nEnter a deposit value: ");
		deposit = sc.nextDouble();
		accountBank.deposit(deposit);
		System.out.println("Updated account data:\n " + accountBank.toString());
		
		System.out.print("\nEnter a withdraw value: ");
		withdraw = sc.nextDouble();
		accountBank.withdraw(withdraw);
		System.out.println("Updated account data:\n " + accountBank.toString());
		
		sc.close();
	}

}
