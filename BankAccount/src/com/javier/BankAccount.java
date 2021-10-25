package com.javier;
import java.util.Random;
import java.util.ArrayList;

public class BankAccount {
	private String clientFirstName;
	private String clientLastName;
	private String AccountNumber;	
	private double checkBalance;
	private double saveBalance;
	public static int numberOfAccounts = 0;
	public static int amountOfMoney = 0;
	
	public BankAccount(String clientFirstNameParam, String clientLastNameParam, double checkBalanceParam, double saveBalanceParam) {
		clientFirstName = clientFirstNameParam;
		clientLastName = clientLastNameParam;
		checkBalance = checkBalanceParam;
		saveBalance = saveBalanceParam;
		numberOfAccounts ++;
	}

	public void setAccountNumber() {
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++){
			Random rand = new Random();
			int upperbound = 9;
			int int_random = rand.nextInt(upperbound);
			myArray.add(int_random);
			}
		int num1 = myArray.get(0);
		int num2 = myArray.get(1);
		int num3 = myArray.get(2);
		int num4 = myArray.get(3);
		int num5 = myArray.get(4);
		int num6 = myArray.get(5);
		int num7 = myArray.get(6);
		int num8 = myArray.get(7);
		int num9 = myArray.get(8);
		int num10 = myArray.get(9);
		String idnum= String.valueOf(num1)+String.valueOf(num2)+String.valueOf(num3)+String.valueOf(num4)+String.valueOf(num5)+String.valueOf(num6)+String.valueOf(num7)+String.valueOf(num8)+String.valueOf(num9)+String.valueOf(num10);
		this.AccountNumber = idnum;
	}

	public double getCheckBalance() {
		return checkBalance;
	}	

	public double getSaveBalance() {
		return saveBalance;
	}
	
	//Display Account Info
	public void displayInfo(){
		System.out.println( "__________________________________________ ");
		System.out.println( " ");
		System.out.println( "Hello"+" "+this.clientFirstName+" "+this.clientLastName);
		System.out.println( "Account number: "+ this.AccountNumber);
		System.out.println( "Your Checking Balance: "+ this.checkBalance);
		System.out.println( "Your Saving Balance: "+ this.saveBalance);
		System.out.println( "------------------------------------------");
		double sum;
        sum = getCheckBalance() + getSaveBalance();	
		System.out.println( "Your General Balance: "+ sum);
		System.out.println( "__________________________________________");
	}
	
	public void displaySave(){
		System.out.println( "Your Saving Balance:"+ this.saveBalance);
	}
	
	public void displayCheck(){
	    System.out.println( "Your Checking Balance:"+ this.checkBalance);
	}	
	
	//Deposit to Check Account	
	public void depositCheck(int amount){
		this.checkBalance = this.checkBalance+ amount;
		System.out.println( "The deposit has been made successfully.");
		amountOfMoney = amountOfMoney + amount;
		displayCheck();
	}
	
	//Deposit to Saving Account	
	public void depositSaving(int amount){
		this.saveBalance = this.saveBalance+ amount;
		System.out.println( "The deposit has been made successfully.");
		amountOfMoney = amountOfMoney + amount;
		displaySave();
	}
		
	//Withdraw to Check Account	
	public void withdrawCheck(int amount){
		if(this.checkBalance >= amount) {
			this.checkBalance = this.checkBalance- amount;
			System.out.println( "The withdraw has been made successfully.");
			displayCheck();
			amountOfMoney = amountOfMoney - amount;
		} else {
		    System.out.println("We cannot make the withdrawal because you do not have enough funds in your account.");
		}

	}
		
	//Withdraw to Saving Account	
	public void withdrawSaving(int amount){
		if(this.saveBalance >= amount) {
			this.saveBalance = this.saveBalance- amount;
			System.out.println( "The withdraw has been made successfully.");
			displaySave();
			amountOfMoney = amountOfMoney - amount;
		} else {
		    System.out.println("We cannot make the withdrawal because you do not have enough funds in your account.");
		}

	}	
}
