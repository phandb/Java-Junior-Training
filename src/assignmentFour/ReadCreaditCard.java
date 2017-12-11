package assignmentFour;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCreaditCard {
	/*Creating a balance variable that calculates the running balance of the user’s account
If the field says CREDIT, then add the amount to the balance
If the field says DEBIT, then subtract the amount to the balance
If the final amount is greater than zero, charge a 10% fee and warn the user
If the final amount is zero, thank the user for their payments
If the final amount is less than zero, thank the user for their payment and display their overpayment.

*/

	public static void main(String[] args) {
		// This program will read data from credit card accounts
		List<String[]> data = new ArrayList<String[]>(); 
		String fileName = "C:\\Users\\Dalton\\Documents\\Udemy\\Become a Junior Java Software Developer\\creditcardaccounts.csv";
		String dataRow;
		double balance = 0.0;
		try {
			//Open the file
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			//Read the file as long as it is not empty
			while ((dataRow = br.readLine()) != null){
				//parse the data by commas
				String[] line = dataRow.split(",");
				
				//Add data to collection
				data.add(line);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Process data in the file
		for (String[] account:data) {
			System.out.print("[ ");
			for (String field : account) {
				System.out.print(field + " ");
				
				
			}
			System.out.println("]");
			//System.out.println(account[1]);
			if (account[1].equalsIgnoreCase("CREDIT") || account[1].equalsIgnoreCase("FEE")) {
				balance = balance + Double.parseDouble(account[3]) ;
				//System.out.println("New Balance: $" + String.format("%.2f", balance));
				
			}else if (account[1].equalsIgnoreCase("DEBIT")) {
				balance = balance - Double.parseDouble(account[3]) ;
				//System.out.println("New Balance: $" + String.format("%.2f", balance));
			}
			System.out.println("New Balance: $" + String.format("%.2f", balance));
		}
		//Check the final balance
		if (balance == 0){
			System.out.println("New Balance: $" + String.format("%.2f", balance));
			System.out.println("Thank you for your payment");
		}else if (balance > 0){
			System.out.println("10% fee is applied to your balance: $" + String.format("%.2f",0.1*balance));
			balance = 1.1*balance;
			System.out.println("New Balance: $" + String.format("%.2f", balance));
		}else  {
			balance = 0-balance;
			System.out.println("Thank you for your payment");
			System.out.println("You overpaid amount of $" + String.format("%.2f", balance));
		}

	}

}
