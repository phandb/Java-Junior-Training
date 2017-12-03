package oop;

public class LoanAccount implements IRate{

	@Override
	public void setRate() {
		System.out.println("Rate");
	}

	@Override
	public void increaseRate() {
		System.out.println( "Increasing Rate");
		
	}
	
	public void setTerm(int term) {
		System.out.println("Setting the term to: " + term + " year.");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Amortization schedule");
	}

}
