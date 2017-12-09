package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		//This will read a text file and will retrieve phone number;
		
		String filename = "C:\\Users\\Dalton\\Documents\\Udemy\\Become a Junior Java Software Developer\\PhoneNumber.txt";
		File file = new File(filename);
		String[] phoneNums = new String[9];
		
		String phoneNum = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			for (int i=0; i<phoneNums.length; i++) {
				phoneNums[i] = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file");
			e.printStackTrace();
		}
		//valid phone number:
				//10 digits long;
				//Area code cannot start in 0 or 9
				//There can be 911 in the phone
		for (int i =0; i<phoneNums.length; i++) {
			phoneNum = phoneNums[i];
			System.out.println("----------------------------------------------");
		
			try {
				if (phoneNum.length() != 10) {
					throw new TenDigitsException(phoneNum);
				}
				if ((phoneNum.substring(0,1).equals("0"))|| (phoneNum.substring(0, 1).equals( "9"))) {
					throw new AreaCodeException(phoneNum);
				}
				for (int n=0; n<phoneNum.length();n++) {
					if(phoneNum.substring(n, (n+1)).equals("9")) {
						if (phoneNum.substring(n+1,  n+3).equals("11")){
							throw new EmergencyException(phoneNum);
						}
					}
				}
				System.out.println("Valid Phone Number: " + phoneNum);
			}catch (TenDigitsException e){
				System.out.println("ERROR: Phone number is not 10 digits");
				System.out.println(e.toString());
			}catch (AreaCodeException e){
				System.out.println("ERROR: Phone number has invalid area code");
				System.out.println(e.toString());
			} catch (EmergencyException e) {
				System.out.println("ERROR: Invalid 911 sequence found");
				System.out.println(e.toString());
			}
		}
	}
}

class TenDigitsException extends Exception{
	String num;
	TenDigitsException(String num){
		this.num = num;
	}
	public String toString() {
		return ("TenDigitsException: " + num);
	}
}

class AreaCodeException extends Exception{
	String num;
	AreaCodeException(String num){
		this.num = num;
	}
	public String toString() {
		return ("AreaCodeException: " + num);
	}
	
}

class EmergencyException extends Exception{
	String num;
	EmergencyException(String num){
		this.num = num;
	}
	public String toString() {
		return ("EmergencyException: " + num);
	}
}


