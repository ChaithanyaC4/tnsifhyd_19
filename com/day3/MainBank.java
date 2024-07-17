package com.day3;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankEncapsulation bank=new BankEncapsulation(75590107, 12000);
		
		bank.checkbalance();
		bank.deposit(3000);
		bank.checkbalance();
		bank.withdraw(12000);
		bank.checkbalance();
	}

}
