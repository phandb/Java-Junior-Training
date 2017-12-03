package oop;

public class BankAccountApp  {

	public static void main(String[] args) {
		// Creating new bank account 
		BankAccount acc1 = new BankAccount();
		
		// acc1.name ="Roger Hue";
		//with Encapsulate
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		
		
		acc1.setSsn("126545601");
		System.out.println("SSN: " + acc1.getSsn());
		acc1.accountNumber = "25641215";
		acc1.balance = 10000;
		
		acc1.setRate();
		acc1.increaseRate();
		
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		
		//Polymorphism through Overriding
		System.out.println(acc1.toString());
		
		//Polymorphism through Overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "25621131";
		
		
		BankAccount acc3 = new BankAccount("Saving Account",5000.0);
		acc3.accountNumber = "25642112";
		/*
		acc3.checkBalance();
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
			*/
	}

}
