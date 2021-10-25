package com.javier;

public class BankAccountTest {
	public static void main( String args[] ) {
		BankAccount a1 = new BankAccount("Javier", "Sanchez", 0,0);
		a1.setAccountNumber();
		BankAccount a2 = new BankAccount("Laura", "Coto", 0,0);
		a2.setAccountNumber();
		BankAccount a3 = new BankAccount("Sergio", "Mora", 0,0);
		a3.setAccountNumber();
		
		a1.depositCheck(1000);
		a1.depositSaving(500);
		a1.withdrawCheck(1000000);
		a1.withdrawSaving(100);
		
		a2.depositCheck(100);
		a2.depositSaving(300);
		a2.withdrawCheck(100);
		a2.withdrawSaving(100);
		
		a3.depositCheck(50);
		a3.depositSaving(50);
		a3.withdrawCheck(1000000);
		a3.withdrawSaving(70);
		
	
		a1.displayInfo();
		a1.displayInfo();
		a2.displayInfo();
		a3.displayInfo();
			
		System.out.println( "__________________________________________ ");
		System.out.println( " ");
		System.out.println( "General Bank Information");
		System.out.println( "Number of accounts created: "+ BankAccount.numberOfAccounts);
		System.out.println( "Total money in the bank: "+ BankAccount.amountOfMoney);
		System.out.println( "__________________________________________");
		
	}

}
