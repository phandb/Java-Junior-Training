package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("456234545", 1000);
		BankAccount acc2 = new BankAccount("641355971", 2000);
		BankAccount acc3 = new BankAccount("671572018", 3000);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(1500);
		acc1.payBill(500);
		acc1.accrue();
		System.out.println(acc1.toString());
	}
	

}

class BankAccount implements IInterest{
	//Properties of bank account
	private static int iD = 1000;					//Internal ID
	private String accountNumber;  //ID + random 2-digit number + first 2 of SSN
	private static final  String routingNumber = "319725331";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructors
	public BankAccount(String SSN, double initDeposit) {
		System.out.println("New Account Created");
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int)(Math.random()*100);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " +  balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" +
	           "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
	}
	
	
}
