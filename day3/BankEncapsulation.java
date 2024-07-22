package com.day3;

public class BankEncapsulation {
	private int Acno;
	private double balance;
	
	public BankEncapsulation(int acno,double balance) {
		this.Acno=acno;
		if(balance>0) {
			this.balance=balance;
		}
		else {
			this.balance=0;
		}
	}
	
	public void deposit(double amount) {
		
		if(amount>0) {
			balance+=amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
		}
	}
	
	public void checkbalance() {
		System.out.println("Balance in Ac: "+Acno+"= "+balance);
	}
	

}
