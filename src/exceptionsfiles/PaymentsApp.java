package exceptionsfiles;
import java.util.*;
public class PaymentsApp {
	// Take payment from user
	public static void main(String[] args) {
		double payment = 0;
		boolean positivePymt = true;
		do {
		//1. Ask user for input
		System.out.print("Enter the payment amount: ");
		
			//2. get the amount and test the value
			Scanner in = new Scanner(System.in);
			//3. Handle exceptions appropriately
			try {
				payment = in.nextDouble();
				if (payment < 0) {
					// throw error
					throw new NegativePaymentException(payment);
				}
				else {
					positivePymt = true;
				}
			}catch (NegativePaymentException e ) {
				System.out.println(e.toString());
				System.out.println("Please try again..."
						+ "");
				positivePymt = false;
			}
			
			//3. Handle exceptions appropriately
			
		
		
		}while(!positivePymt);
		System.out.println("Thank you for your payment of $"+ payment);
	}

}
