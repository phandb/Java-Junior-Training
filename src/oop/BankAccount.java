package oop;

public class BankAccount implements IRate{
	//Define variables
	String accountNumber;
	//static belongs to the class not the object instance
	//final >> constant (often static final)
	private static final String routingNumber = "319726956";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructor definition: unique methods
	//1. Use to define or set up, initialize properties of an object
	//2. Constructors are called IMPLICITLY upon INSTANTIATED
	//3. The same name as the class itself
	//4. Constructors have no return type
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading: call same method name
	BankAccount(String accountType) {
		System.out.println("ACCOUNT TYPE: " + accountType);
	}
	BankAccount(String accountType, double initDeposit) {
		//initDeposit, accountType, Msg are all local variable
		//that means they are available only for the block they are in
		System.out.println("ACCOUNT TYPE: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error: Minimum deposit must be at least $1000";
			
		}else {
			Msg = "Thanks for initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	//SETTER and GETTER
	
	//Allow all user to define the name
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//interface methods
	@Override
	public void setRate() {
		System.out.println("Setting Rate");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increasing Rate");
		
	}

	//define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	//private : can only be called within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT #: " + accountNumber + ". ROUNTING #: " + routingNumber + 
				". BALANCE: $" + balance + " ]";
	}


}
